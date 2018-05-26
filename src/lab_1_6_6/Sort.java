package lab_1_6_6;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{-10, 45, 3, 23, 11, 32, 10, -2, 0, -5, 15, 37,};
        int[] sort = new int[12];
        System.out.println(Arrays.toString(arr));
        int x = 0;
        for (int i = 0; i < sort.length; i++) {
            if(arr[i] < 0){
                sort[x++] = arr[i];
            }
        }
        for (int i = 0; i < sort.length; i++) {
            if (arr[i] >= 0){
                sort[x++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(sort));
    }
}
