package berkutLab;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n > 0){
            System.out.print(n%10);
            n /= 10;
        }
    }
}
