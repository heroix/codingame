package clash;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-27.
 */
public class SmallestPrimeFactor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N == 0 || N == 1) {
            System.out.println("NONE");
            return;
        }

        System.out.println(smallestFactor(N));
    }

    public static long smallestFactor(int C) {
        for (int i = 2; i * i <= C; i++) {
            if (C % i == 0) {
                return i;
            }
        }

        return C;
    }
}
