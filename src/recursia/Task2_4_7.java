package recursia;

import java.math.BigInteger;

public class Task2_4_7 {
    public static void main(String[] args) {

        System.out.println(factorial(0));
    }

    public static BigInteger factorial(int value) {

        if (value == 1 || value == 0) return BigInteger.ONE;
        return BigInteger.valueOf(value).multiply(factorial((value - 1)));
    }

}
