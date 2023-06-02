package org.algo.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SelectionSort extends Sort{
    @Override
    public int[] sort(int[] inputElements) {
        System.out.println("Using Selection Sort");
        int n = inputElements.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(inputElements[min]>inputElements[j]){
                    min = j;
                }
            }
            int temp = inputElements[i];
            inputElements[i] = inputElements[min];
            inputElements[min] = temp;
        }
        return inputElements;
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
            System.out.println("Execution Time for Selection Sort using Thread ID-"+Thread.currentThread().getId()+" : "+(end-start)+" ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
