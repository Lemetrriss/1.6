package berkutLab;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] task = new int[sc.nextInt()];
        int time = sc.nextInt();
        for (int i = 0; i < task.length; i++) {
            task[i] = sc.nextInt();
        }
        sc.close();
        int summ = 0;
        int count = 0;
        for (int aTask : task) {
            summ += aTask;
            if (summ <= time) {
                count++;
            } else break;
        }
        System.out.println(count);
    }
}
