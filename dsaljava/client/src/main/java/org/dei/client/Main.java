package org.dei.client;

import org.algo.sort.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Numbers of Sorting algos you want to use (Without Space): (1 to 7)");
        System.out.println("1-BubbleSort, 2-SelectionSort, 3-InsertionSort, 4-MergeSort, 5-QuickSort, 6-HeapSort, 7-BucketSort");
        String choice = sc.next();

        int n = choice.length();

        String[] sorting = {"Bubblesort", "Selectionsort", "Insertionsort", "Mergesort", "Quicksort", "Heapsort", "Bucketsort"};
        Thread[] threads = new Thread[n];

        long start = System.currentTimeMillis();
        for(int i=0; i<n; i++){
            int k = choice.charAt(i)-'1';
            Sort sort = SortAdapter.getSortObject(sorting[k]);
            Runnable rn = new runningSorts(sort, sorting[k]);
            threads[i] = new Thread(rn);
            threads[i].start();
        }
        for(int i=0; i<n; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Total Execution Time : "+(end-start)+" ms");

    }
}
class runningSorts implements Runnable{
    private Sort sort;
    private String sortingName;

    public runningSorts(Sort s, String sn){
        sort = s;
        sortingName = sn;
    }

    public void run() {
        sort.sort("C:\\Users\\asus\\IdeaProjects\\dsaljava\\unsorted.txt", "C:\\Users\\asus\\IdeaProjects\\dsaljava\\sorted_"+sortingName+".txt");
    }
}
