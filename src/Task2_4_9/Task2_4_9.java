package Task2_4_9;

import java.util.Arrays;

public class Task2_4_9 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenArray(15)));
        byte a=5;
        byte b=5;
        char c=(char)(a+b);
        System.out.println(a+b);
    }


    public static int[] evenArray(int number) {

        int[] arr = new int[number / 2];
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
}
