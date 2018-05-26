package berkutLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Watermel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] count = new int[sc.nextInt()];
        if(count.length<2)
            System.out.println("Ooops!");
        for (int i = 0; i < count.length; i++) {
            count[i] = r.nextInt(30000);
        }
        System.out.println(Arrays.toString(count));
        int max = count[0];
        for (int i : count) {
            if(i > max)
                max = i;
        }
        System.out.println("Max = "+max);
        int min = count[0];
        for (int i : count) {
            if(i < min)
                min = i;
        }
        System.out.println("Min = "+min);
    }
}
