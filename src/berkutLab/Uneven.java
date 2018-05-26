package berkutLab;

import java.util.Arrays;
import java.util.Scanner;

public class Uneven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[sc.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        for (int i : num) {
            if(i%2 != 0)
                System.out.print(i+" ");
        }
    }
}