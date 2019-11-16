package recursia;

import java.math.BigInteger;

public class Task2_4_7 {
    public static void main(String[] args) {

        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {

        if (value == 1) return BigInteger.ONE;
        return factorial(BigInteger.valueOf(value *(value - 1)));
    }

}
