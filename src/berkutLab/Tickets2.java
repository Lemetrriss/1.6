package berkutLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Tickets2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rows, columns, baseCost;
        {
            rows = sc.nextInt();
            columns = sc.nextInt();
//            baseCost = sc.nextInt();
        }
        int[][] cost = new int[rows][columns];
        int[][] reserve = new int[rows][columns];
                        // price depends from row? how far from scene?
        for (int i = 0; i < cost.length; i++) {
            Arrays.fill(cost[i], sc.nextInt());
        }
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < reserve[0].length; j++) {
                reserve[i][j] = sc.nextInt();
            }
        }
        long summ = 0;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[i][j] == 0) summ +=cost[i][j];
            }
        }

        for (int[] price : cost) {
            System.out.println("cost = " + Arrays.toString(price));
        }
        System.out.println();
        for (int[] place : reserve) {
            System.out.println("reserve = " + Arrays.toString(place));
        }
        System.out.println("summ = "+summ);
    }
}