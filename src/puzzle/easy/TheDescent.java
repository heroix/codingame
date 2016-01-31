package puzzle.easy;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-28.
 */
public class TheDescent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            int highestMountainIndex = 0;
            int highestMountainHeight = 0;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (mountainH > highestMountainHeight) {
                    highestMountainHeight = mountainH;
                    highestMountainIndex = i;
                }
            }

            if (spaceX == highestMountainIndex) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
            }
        }
    }

}
