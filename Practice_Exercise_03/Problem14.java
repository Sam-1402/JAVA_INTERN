package Practice_Exercise_03;

public class Problem14 {
    public static void main(String[] args){
        int[] array = new int[100];
        for(int i=0; i<100; i++){
            array[i] = (int)(Math.random()*(101));
        }
        int noOfduplicate = 0;
        int check = 0;
        for(int i=0; i<100; i++){
            check = search(array, array[i]);
            if(check != -1 && check != i){
                noOfduplicate++;
            }
        }
        int[] newArray = new int[100-noOfduplicate];
        int ind = 0;
        for(int i=0; i<100; i++){
            check = search(array, array[i]);
            if(check == i){
                newArray[ind++] = array[i];
            }
        }
        for(int i=0; i<100; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
        for(int i=0; i<(100-noOfduplicate); i++){
            System.out.print(newArray[i]+", ");
        }

    }
    public static int search(int[] a, int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
}
