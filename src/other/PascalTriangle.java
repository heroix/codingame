package other;

/**
 * Created by heroix on 2016-02-03.
 */
public class PascalTriangle {

    public static void main(String[] args) {
        System.err.println(0);
        System.err.println(getPascalTriangeValue(0, 0) == 1);

        System.err.println(1);
        System.err.println(getPascalTriangeValue(1, 0) == 1);
        System.err.println(getPascalTriangeValue(1, 1) == 1);

        System.err.println(2);
        System.err.println(getPascalTriangeValue(2, 0) == 1);
        System.err.println(getPascalTriangeValue(2, 1) == 2);
        System.err.println(getPascalTriangeValue(2, 2) == 1);

        System.err.println(3);
        System.err.println(getPascalTriangeValue(3, 0) == 1);
        System.err.println(getPascalTriangeValue(3, 1) == 3);
        System.err.println(getPascalTriangeValue(3, 2) == 3);
        System.err.println(getPascalTriangeValue(3, 3) == 1);

        System.err.println(4);
        System.err.println(getPascalTriangeValue(4, 0) == 1);
        System.err.println(getPascalTriangeValue(4, 1) == 4);
        System.err.println(getPascalTriangeValue(4, 2) == 6);
        System.err.println(getPascalTriangeValue(4, 3) == 4);
        System.err.println(getPascalTriangeValue(4, 4) == 1);

        System.err.println(5);
        System.err.println(getPascalTriangeValue(5, 0) == 1);
        System.err.println(getPascalTriangeValue(5, 1) == 5);
        System.err.println(getPascalTriangeValue(5, 2) == 10);
        System.err.println(getPascalTriangeValue(5, 3) == 10);
        System.err.println(getPascalTriangeValue(5, 4) == 5);
        System.err.println(getPascalTriangeValue(5, 5) == 1);

        System.err.println(6);
        System.err.println(getPascalTriangeValue(6, 0) == 1);
        System.err.println(getPascalTriangeValue(6, 1) == 6);
        System.err.println(getPascalTriangeValue(6, 2) == 15);
        System.err.println(getPascalTriangeValue(6, 3) == 20);
        System.err.println(getPascalTriangeValue(6, 4) == 15);
        System.err.println(getPascalTriangeValue(6, 5) == 6);
        System.err.println(getPascalTriangeValue(6, 6) == 1);
    }

    private static int getPascalTriangeValue(int height, int length) {
        if ((height + 1) == 1 || (length + 1) == 1 || height == length) {
            return 1;
        } else {
            return getPascalTriangeValue(height - 1, length - 1) + getPascalTriangeValue(height - 1, length);
        }
    }
}
