package ckasswork;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int a[] = {-1,3,7,4,7,9,4,3,8,11,8,1,4,3,6};
        int b[] = {-1,3,7,4,7,9,4,3,8,11,8,1,4,3,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int pos = Arrays.binarySearch(a, 8);
        int pos2 = Arrays.binarySearch(a, 5);
        System.out.println("pos = " + pos);
        System.out.println("pos2 = " + pos2);
        System.out.println(Arrays.equals(a,b));
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}
