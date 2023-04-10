package algorithm;

import org.junit.Assert;
import java.util.Arrays;
import org.junit.Assert;

public class UnitTestSorting {


      //This class is about Unit testing for Sorting Algorithm.



        //Now implement Unit test for rest of the soring algorithm...................below

    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            //Selection Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.selectionSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Insertion Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.insertionSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Bubble Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.bubbleSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Merge Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.mergeSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Quick Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.quickSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Bucket Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.bucketSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Heap Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.heapSort(Arrays.copyOf(unSortedArray, unSortedArray.length)));
            //Shell Sort
            Assert.assertArrayEquals(sortedArray,
                    sort.shellSort(Arrays.copyOf(sortedArray, unSortedArray.length)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }




    }
}
