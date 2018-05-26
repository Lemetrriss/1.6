package berkutLab;

import java.util.Scanner;

public class SummSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long summ = 0;
        long x = sc.nextLong();
        for (long i = 1; i < x; i++) {
            summ+=Math.pow(i,2);
        }
        System.out.println(summ);
    }
}
