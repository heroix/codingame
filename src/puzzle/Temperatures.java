package puzzle;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-28.
 */
public class Temperatures {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        if (n == 0) {
            System.out.println(0);
            return;
        }
        in.nextLine();

        int closest = in.nextInt();
        for (int i = 1; i < n; i++) {
            int temp = in.nextInt();

            if (temp == 0) {
                closest = 0;
                break;
            }

            int dist = temp > 0 ? 0 + temp : 0 - temp;
            int distClosest = closest > 0 ? 0 + closest : 0 - closest;
            if (dist < distClosest || (dist == distClosest && temp > 0)) {
                closest = temp;
            }

        }
        
        System.out.println(closest);
    }
}
