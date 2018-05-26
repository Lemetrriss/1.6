package lab_1_6_1;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[][][] arr = new int[3][4][5];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int l = 0; l < arr[0][0].length; l++) {
                    arr[i][j][l] = k++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int l = 0; l < arr[0][0].length; l++) {
                    System.out.printf("%3d", arr[i][j][l]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}