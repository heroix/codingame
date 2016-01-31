package puzzle;

import java.util.Scanner;

/**
 * Created by heroix on 2016-01-31.
 */
public class Defibrillators {

    double longtitude;
    double latitude;

    public static void main(String args[]) {
        new Defibrillators().run();
    }

    void run() {
        Scanner in = new Scanner(System.in);
        longtitude = calculateDistance(in.next());
        latitude = calculateDistance(in.next());
        int N = in.nextInt();
        in.nextLine();

        Defibrillator closest = null;
        double closestDistance = Double.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] data = DEFIB.split(";");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String address = data[2];
            String phone = data[3];
            double lon = calculateDistance(data[4]);
            double lat = calculateDistance(data[5]);

            double distance = calculateDistance(lon, lat);

            if (distance < closestDistance) {
                closestDistance = distance;
                closest = new Defibrillator(id, name, address, phone, lon, lat);
            }
        }

        System.out.println(closest != null ? closest.name : null);
    }

    double calculateDistance(double lon, double lat) {
        double x = (longtitude - lon) * Math.cos((lat + latitude) / 2);
        double y = latitude - lat;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 6371;
    }

    static double calculateDistance(String coordinates) {
        return Double.parseDouble(coordinates.replace(',', '.'));
    }

    class Defibrillator {
        int id;
        String name;
        String address;
        String phone;
        double lon;
        double lat;

        public Defibrillator(int id, String name, String address, String phone, double lon, double lat) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.lon = lon;
            this.lat = lat;
        }

    }

}
