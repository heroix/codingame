package clash;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-27.
 */
public class UpperCaseLettersOnly {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        char[] chars = S.toCharArray();

        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((ch >= 'A' && ch <= 'Z')) {
                answer = answer + ch;
            }
        }

        System.out.println(answer);
    }

}
