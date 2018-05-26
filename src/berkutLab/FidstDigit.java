package berkutLab;

import java.util.Scanner;

public class FidstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long first = 0;
        while(Math.abs(x)>0){
            first = x%10;
            x /= 10;
        }
        System.out.println(first);
    }
}
