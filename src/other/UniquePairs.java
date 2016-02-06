package other;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by heroix on 2016-01-31.
 */
public class UniquePairs {

    public static void main(String[] args) {
        System.err.println(count(0));
        System.err.println(count2(0));
        System.err.println(count3(0));

        System.err.println(count(1));
        System.err.println(count2(1));
        System.err.println(count3(1));

        System.err.println(count(2));
        System.err.println(count2(2));
        System.err.println(count3(2));

        System.err.println(count(3));
        System.err.println(count2(3));
        System.err.println(count3(3));

        System.err.println(count(4));
        System.err.println(count2(4));
        System.err.println(count3(4));

        System.err.println(count(5));
        System.err.println(count2(5));
        System.err.println(count3(5));

        System.err.println(count(6));
        System.err.println(count2(6));
        System.err.println(count3(6));
    }

    static int count(int n) {
        int k = 2; // members in pair
        int nFactorial = factorial(n);
        int kFactorial = factorial(k);
        int nMinusKFactorial = factorial(n - k);
        int uniquePairs = nFactorial / (kFactorial * nMinusKFactorial);

        return uniquePairs;
    }

    static int count2(int n) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    static int count3(int n) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
