package lab_1_6_2;

import java.util.Arrays;

public class WriteArray {
    private static int[][] arr = new int[9][9];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + 9*j + 1;
            }
        }
        for (int[] a : arr) {
//            for (int ints : a) {
//                System.out.printf("%3d", ints);
//            }
            System.out.println(Arrays.toString(a));
            System.out.println();
        }
    }
}
