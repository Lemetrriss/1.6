package berkutLab;

import java.util.Scanner;

public class Vasya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            if(num%10 == 5)
                count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
