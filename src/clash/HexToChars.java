package clash;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-27.
 */
public class HexToChars {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int valueCount = in.nextInt();
        String answer = "";

        for (int i = 0; i < valueCount; i++) {
            String value = in.next();

            char intToChar = (char)Integer.parseInt(value, 16);
            answer = answer + intToChar;
        }

        System.out.println(answer);
    }

}
