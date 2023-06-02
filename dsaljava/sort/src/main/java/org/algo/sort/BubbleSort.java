package org.algo.sort;

import java.io.*;

public class BubbleSort extends Sort{
    @Override
    public int[] sort(int[] inputElements) {
        System.out.println("Using Bubble Sort");
        int n = inputElements.length;
        boolean swapped = true;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(inputElements[j] > inputElements[j+1]){
                    int temp = inputElements[j];
                    inputElements[j] = inputElements[j+1];
                    inputElements[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped){
                break;
            }
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
            System.out.println("Execution Time for Bubble Sort using Thread ID-"+Thread.currentThread().getId()+" : "+(end-start)+" ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
