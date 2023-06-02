package org.algo.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HeapSort extends Sort{
    @Override
    public int[] sort(int[] inputElements) {
        System.out.println("Using Heap Sort");
        int N = inputElements.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(inputElements, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp =  inputElements[0];
            inputElements[0] =  inputElements[i];
            inputElements[i] = temp;

            heapify( inputElements, i, 0);
        }
        return inputElements;
    }
    void heapify(int arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
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
            System.out.println("Execution Time for Heap Sort using Thread ID-"+Thread.currentThread().getId()+" : "+(end-start)+" ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
