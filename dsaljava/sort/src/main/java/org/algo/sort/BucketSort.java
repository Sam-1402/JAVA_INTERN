package org.algo.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BucketSort extends Sort{
    @Override
    public int[] sort(int[] inputElements) {
        System.out.println("Using Bucket Sort");
        int max_value = maxValue(inputElements);
        int[] bucket = new int[max_value + 1];
        int[] sorted_arr = new int[inputElements.length];

        for (int i= 0; i <inputElements.length; i++)
            bucket[inputElements[i]]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_arr[pos++] = i;

        return sorted_arr;
    }

    static int maxValue(int[] arr) {
        int max_value = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max_value)
                max_value = arr[i];
        return max_value;
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

            System.out.println("Execution Time for Bucket Sort using Thread ID-"+Thread.currentThread().getId()+" : "+(end-start)+" ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
