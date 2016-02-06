package other;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;

/**
 * Created by heroix on 2016-02-03.
 */
public class PascalTriangleBigInteger {

    public static void main(String[] args) {
        System.err.println(get(4, 2).equals("6"));
        System.err.println(get(5, 0).equals("1"));
        System.err.println(get(67, 34).equals("14226520737620288370"));
        System.err.println(get(4300, 2).equals("9242850"));
    }

    private static String get(int height, int length) {
        return get(BigInteger.valueOf(height), BigInteger.valueOf(length)).toString();
    }

    private static BigInteger get(BigInteger height, BigInteger length) {
        if (height.add(ONE).equals(ONE) || length.add(ONE).equals(ONE) || height.equals(length)) {
            return ONE;
        } else {
            return get(height.subtract(ONE), length.subtract(ONE)).add(get(height.subtract(ONE), length));
        }
    }
}
