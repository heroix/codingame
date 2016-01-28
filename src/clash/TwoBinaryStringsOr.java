package clash;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-27.
 */
public class TwoBinaryStringsOr {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String answer = "";

        String n1 = in.next();
        String n2 = in.next();
        char[] N1 = n1.toCharArray();
        char[] N2 = n2.toCharArray();

        for (int i = 0; i < N1.length; i++) {
            if (N1[i] == '1' || N2[i] == '1') {
                answer = answer + 1;
            } else {
                answer = answer + 0;
            }
        }

        System.out.println(answer);
    }

}
