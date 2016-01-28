package puzzle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by heroix on 2016-01-28.
 */
public class AsciiArt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine().toUpperCase();
        System.err.println(L + " " + H + " " + T);

        Map<Character, String[]> symbolToASCII = new HashMap<>();

        for (int i = 0; i < H; i++) {
            // parse each given line
            String ROW = in.nextLine();

            int pointToNextLetter = 0;
            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
                // save first line of ascii representation for each letter A-Z
                symbolToASCII.putIfAbsent(alphabet, new String[H]);
                String[] letterLines = symbolToASCII.get(alphabet);
                letterLines[i] = ROW.substring(pointToNextLetter, pointToNextLetter + L);
                pointToNextLetter += L;
            }
            // save line of last (unknown) symbol
            symbolToASCII.putIfAbsent('?', new String[H]);
            String[] letterLines = symbolToASCII.get('?');
            letterLines[i] = ROW.substring(pointToNextLetter, pointToNextLetter + L);
        }

        char[] charsToPrint = T.toCharArray();
        for (int i = 0; i < H; i++) {
            // print result line by line
            String resultLine = "";
            for (int j = 0; j < charsToPrint.length; j++) {
                char ch = charsToPrint[j];
                // if symbol is unknown represent it as '?'
                String[] asciiSymbol = symbolToASCII.get((ch >= 'A' && ch <= 'Z') ? ch : '?');
                resultLine = resultLine + asciiSymbol[i];
            }
            System.out.println(resultLine);
        }
    }

}
