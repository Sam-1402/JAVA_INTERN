package org.algo.sort;

public class SortAdapter {
    public static Sort getSortObject(String sortType)
    {
        Sort sort;
        if(sortType.equalsIgnoreCase("Bubblesort")){
            sort = new BubbleSort();
        }
        else if(sortType.equalsIgnoreCase("Selectionsort")){
            sort = new SelectionSort();
        }
        else if(sortType.equalsIgnoreCase("Insertionsort")){
            sort = new InsertionSort();
        }
        else if(sortType.equalsIgnoreCase("Heapsort")){
            sort = new HeapSort();
        }
        else if(sortType.equalsIgnoreCase("quicksort")){
            sort = new QuickSort();
        }
        else if(sortType.equalsIgnoreCase("Bucketsort")){
            sort = new BucketSort();
        }
        else if(sortType.equalsIgnoreCase("shellsort")){
            sort = new ShellSort();
        }
        else{
            sort = new MergeSort();
        }
        return sort;
    }
}
