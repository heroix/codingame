package puzzle;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-29.
 */
public class ChuckNorris {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String binaryMessage = stringToBinaryMessage(MESSAGE);
        String encoded = binaryMessageToChuckNorris(binaryMessage);
        System.out.println(encoded);
    }

    private static String stringToBinaryMessage(String message) {
        char[] chars = message.toCharArray();
        String binaryMessage = "";
        for (int i = 0; i < chars.length; i++) {
            String binaryChar = Integer.toBinaryString(chars[i]);
            while (binaryChar.length() < 7) {
                binaryChar = "0" + binaryChar;
            }
            binaryMessage = binaryMessage + binaryChar;
        }
        return binaryMessage;
    }

    private static String binaryMessageToChuckNorris(String binaryMessage) {
        String result = "";
        char[] bits = binaryMessage.toCharArray();

        char bit = bits[0];
        int bitCount = 1;
        for (int i = 1; i < bits.length; i++) {
            if (bits[i] != bit) {
                result = result + encrypt(bit, bitCount);
                bit = bits[i];
                bitCount = 1;
            } else {
                bitCount++;
            }
            if (i + 1 == bits.length) { // encrypt the last one encrypt
                result = result + encrypt(bit, bitCount);
            }
        }

        return result.substring(0, result.length() - 1);
    }

    private static String encrypt(char character, int count) {
        String result = character == '1' ? "0 " : "00 ";
        for (int i = 0; i < count; i++) {
            result = result + "0";
        }
        return result + " ";
    }
    
}
