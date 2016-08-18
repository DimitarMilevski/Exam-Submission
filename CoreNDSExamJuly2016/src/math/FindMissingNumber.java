package math;

import java.util.ArrayList;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
            ArrayList<Integer> arr = new ArrayList<Integer>();
            // int a[] = { 1,3,4,5,6,7,10 };
            int j = array[0];
            for (int k = 0; k < array.length; k++) {
                if (j == array[k]) {
                    j++;
                    continue;
                } else {
                    arr.add(j);
                    k--;
                    j++;
                }
            }
            System.out.print("missing numbers are ");
            for (int r : arr) {
                System.out.println(" " + r);
            }

        }

    }