package lab_1_6_5;

import java.util.Arrays;

public class Transpose {
    private static int x;
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        for (int[] ints : mat) {
            Arrays.fill(ints, ++x);
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                int y = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = y;
            }
        }
        for (int[] ints : mat) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
