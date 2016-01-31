package puzzle.easy;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-28.
 */
public class SkynetTheChasm {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            if (road - coordX == 1) {
                System.out.println("JUMP");
            } else if (road - coordX - gap < 0 || speed > gap + 1) {
                System.out.println("SLOW");
            } else if (speed <= gap) {
                System.out.println("SPEED"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
            } else {
                System.out.println("WAIT");
            }
        }
    }
}
