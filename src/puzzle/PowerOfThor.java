package puzzle;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-28.
 */
public class PowerOfThor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int distX = lightX - initialTX;
        int distY = lightY - initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            if (distX > 0) {
                distX--;
                if (distY > 0) {
                    distY--;
                    System.out.println("SE");
                } else if (distY > 0) {
                    distY++;
                    System.out.println("NE");
                } else if (distY == 0) {
                    System.out.println("E");
                }
            } else if (distX < 0) {
                distX++;
                if (distY > 0) {
                    distY--;
                    System.out.println("SW");
                } else if (distY > 0) {
                    distY++;
                    System.out.println("NW");
                } else if (distY == 0) {
                    System.out.println("W");
                }
            } else if (distX == 0) {
                if (distY > 0) {
                    distY--;
                    System.out.println("S");
                } else if (distY < 0) {
                    distY++;
                    System.out.println("N");
                }
            }
        }
    }
}
