package berkutLab;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextDouble();
        double summ = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                summ += arr[i];
                count++;
            }
        }
        if(count==0)
            System.out.println("Not Found");
        else System.out.printf("%(.2f", summ/count);
    }
}