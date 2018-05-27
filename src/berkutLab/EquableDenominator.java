package berkutLab;

import java.util.Scanner;

public class EquableDenominator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
            for (int j = 2; j < num; j++) {
                if (num / j == num % j) {
                    System.out.println("У чисда - " + num + ", есть ровный делитель - " + j);
                    count++;
                }
            }
        System.out.println(count);
    }
}
