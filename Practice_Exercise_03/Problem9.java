package Practice_Exercise_03;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the elements of array A:");
        for(int i=0; i<10; i++){
            a[i] = s.nextInt();
        }

        sort(a, 0, 9);

        System.out.println("--------------::IN ASCENDING ORDER::------------");

        for(int i=0; i<10; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();

        System.out.println("--------------::IN DESCENDING ORDER::------------");
        for(int i=9; i>=0; i--){
            System.out.print(a[i]+", ");
        }
        System.out.println();


    }
    public static void sort(int[] a, int s, int e){
        if (s >= e)
        {
            return;
        }
        int mid = (s+e)/2;
        sort(a, s, mid);
        sort(a, mid+1, e);

        merge(a, s, e);
    }
    public static void merge(int[] a, int s, int e){
        int mid  = (s+e)/2;
        int len1 = mid-s+1;
        int len2 = e-mid;
        int[] midl = new int[len1];
        int[] midr = new int[len2];
        int mainInd = s;

        for(int i=0; i<len1; i++){
            midl[i] = a[mainInd++];
        }
        for (int i=0; i<len2; i++){
            midr[i] = a[mainInd++];
        }
        int ind1 = 0;
        int ind2 = 0;
        mainInd = s;

        while(ind1<len1 && ind2<len2){
            if(midl[ind1]>midr[ind2]){
                a[mainInd++] = midr[ind2++];
            }
            else{
                a[mainInd++] = midl[ind1++];
            }
        }

        while(ind1<len1){
            a[mainInd++] = midl[ind1++];
        }
        while(ind2 < len2){
            a[mainInd++] = midr[ind2++];
        }

    }
}
