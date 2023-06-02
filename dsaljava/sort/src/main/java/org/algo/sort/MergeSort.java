package org.algo.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeSort extends Sort {

    @Override
    public int[] sort(int[] inputElements) {
        System.out.println("Using Merge Sort");
        mergeSort(inputElements, 0, inputElements.length-1);
        return inputElements;
    }
    void merge(int array[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    @Override
    public void sort(String inputFile, String outputFile) {
        FileReader fr = null;
        int[] array;
        String[] arr = new String[0];
        try {
            fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            String toSplit = null;
            while((toSplit = br.readLine()) != null){
                arr = toSplit.split(",");
            }
            array = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                array[i] = Integer.parseInt(arr[i]);
            }

            long start = System.currentTimeMillis();
            int[] sorted = sort(array);
            long end = System.currentTimeMillis();

            FileWriter fw = new FileWriter(outputFile);
            for(int i=0; i< sorted.length; i++){
                if(i == sorted.length-1){
                    fw.write(sorted[i]+"");
                }
                else{
                    fw.write(sorted[i]+",");
                }
            }

            fw.close();
            br.close();
            fr.close();
            System.out.println("Execution Time for Merge Sort using Thread ID-"+Thread.currentThread().getId()+" : "+(end-start)+" ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
