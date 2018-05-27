package berkutLab;

import java.util.Arrays;
import java.util.Scanner;

public class Silver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] amount = new int[sc.nextInt()];
        for (int i = 0; i < amount.length; i++) {
            amount[i] = sc.nextInt();
        }
        Arrays.sort(amount);
        for (int i = amount.length-2; i>=0; i--) {
            if (amount[i]<amount[amount.length-1]) {
                System.out.println("Silver medal mark is - "+amount[i]);
                break;
            }
        }
    }
}
