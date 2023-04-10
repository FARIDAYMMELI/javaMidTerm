package algorithm;
import java.util.ArrayList;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

    //Selection Sort
    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //Insertion Sort
    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j;
            //insert
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //Bubble Sort
    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //helper method to divide and split array for merge sort
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    //Helper method to merge arrays for merge sort
    private void merge(int array[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }
        int i, j, k;
        for (i = 0, j = 0, k = left; i < n1 && j < n2; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i++];
            } else {
                array[k] = R[j++];
            }
        }
        for (; i < n1; i++, k++) {
            array[k] = L[i];
        }
        for (; j < n2; j++, k++) {
            array[k] = R[j];
        }
    }

    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        mergeSort(array, 0, array.length - 1);
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }
    private static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1), tmp;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        tmp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = tmp;
        return i + 1;
    }

    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        quickSort(array, 0, array.length - 1);
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    private void heapify(int array[], int size, int index) {
        int largest = index;
        int l = 2 * index + 1;
        int r = 2 * index + 2;
        if (l < size && array[l] > array[largest]) {
            largest = l;
        }
        if (r < size && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != index) {
            int swap = array[index];
            array[index] = array[largest];
            array[largest] = swap;
            heapify(array, size, largest);
        }
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //Implement here
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);
        }
        for (int i = size - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int noOfBuckets = 10;
        int max = array[0], min = array[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double range = (double)(max - min) / noOfBuckets;
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < noOfBuckets; i++) {
            temp.add(new ArrayList<>());
        }
        for (int i = 0; i < array.length; i++) {
            double diff = (array[i] - min) / range - (int) ((array[i] - min) / range);
            if (diff == 0 && array[i] != min) {
                temp.get((int) ((array[i] - min) / range) - 1).add(array[i]);
            } else {
                temp.get((int) ((array[i] - min) / range)).add(array[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            if (!temp.get(i).isEmpty()) {
                temp.get(i).sort(Double::compare);
            }
        }
        int k = 0;
        for (List<Integer> lst : temp) {
            if (!lst.isEmpty()) {
                for (int i : lst) {
                    array[k] = i;
                    k++;
                }
            }
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        //end implementation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
