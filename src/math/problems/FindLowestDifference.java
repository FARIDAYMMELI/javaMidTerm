package math.problems;

public class FindLowestDifference {
    public static int FindLowest(int array1[], int array2[]) {

        int[] dif = new int[array1.length * array2.length];
        int smallest = 0;
        int pos = 0;
        int temp = 0;
        // store the diffrences in new array
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                smallest = Math.abs(array1[i] - array2[j]);
                dif[pos] = smallest;
                pos++;

            }
        }
        // search for the smallest
        for (int i = 0; i < dif.length; i++) {
            //smallest=small[i];
            if (smallest > dif[i]) {
                smallest = dif[i];
            }

            //System.out.println(smallest);
        }
        return smallest;


    }

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int res = FindLowest(array1, array2);
        System.out.println(res);


    }
}





