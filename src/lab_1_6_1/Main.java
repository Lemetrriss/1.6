package lab_1_6_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//lab 1.6.1
/*        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*i + 2;
        }
        System.out.println(Arrays.toString(arr));
*/
//lab 1.6.2
/*
        int[] arr = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int a = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>a) a = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(a);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];
        }
        System.out.println(min);

        int summ = 0;
        for (int i : arr) {
            summ+=i;
        }
        System.out.println(summ);
        System.out.println(1.*summ/12);
*/
//lab 1.6.3
        int[][] arr = new int[4][4];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = i + 4*j + 1;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%3d", arr[i][j]);
//            }
//            System.out.println();
//        }
        int k = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                k++;
                arr[i][j] = k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}