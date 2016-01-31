package puzzle.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by heroix on 2016-01-31.
 */
public class HorseRacingDuals {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] powers = new int[N];
        int closest = Integer.MAX_VALUE;
        int strengh = 0;
        int p_i = 0;
        int p_j = 0;

        for (int i = 0; i < N; i++) {
            powers[i] = in.nextInt();
        }

        Arrays.sort(powers);

        for (int i = 0; i < N - 1; i++) {
            p_i = powers[i];
            p_j = powers[i + 1];
            strengh = p_i > p_j ? p_i - p_j : p_j - p_i;
            if (strengh < closest) {
                closest = strengh;
            }
        }

        System.out.println(closest);
    }

}
