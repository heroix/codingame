package other;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by heroix on 2016-01-31.
 */
public class UniquePairs {

    public static void main(String[] args) {
        int k = 2; // members in pair
        Set<String> n = new HashSet<>();
        n.add("A");
        n.add("B");
        n.add("C");
        n.add("D");

        int nFactorial = factorial(n.size());
        int kFactorial = factorial(k);
        int nMinusKFactorial = factorial(n.size() - k);
        int uniquePairs = nFactorial / (kFactorial * nMinusKFactorial);

        System.err.println(uniquePairs);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
