package multiplayer;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by heroix on 2016-01-30.
 */
public class CodeVsZombies {
    private static final Random rand = new Random();
    private static Scanner in = new Scanner(System.in);
    Human[] humans;
    Zombie[] zombies;
    Hero hero;

    public static void main(String args[]) {
        new CodeVsZombies().run();
    }

    private void run() {
        // game loop
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            hero = new Hero(x, y);
            System.err.println(hero);

            int humanCount = in.nextInt();
            humans = new Human[humanCount];
            for (int i = 0; i < humanCount; i++) {
                int humanId = in.nextInt();
                int humanX = in.nextInt();
                int humanY = in.nextInt();

                Human human = new Human(humanId, humanX, humanY);
                humans[i] = human;
                System.err.println(human);
            }

            int zombieCount = in.nextInt();
            zombies = new Zombie[zombieCount];
            for (int i = 0; i < zombieCount; i++) {
                int zombieId = in.nextInt();
                int zombieX = in.nextInt();
                int zombieY = in.nextInt();
                int zombieXNext = in.nextInt();
                int zombieYNext = in.nextInt();

                Zombie zombie = new Zombie(zombieId, zombieX, zombieY, zombieXNext, zombieYNext);
                zombies[i] = zombie;
                System.err.println(zombie);
            }

            Zombie closestZombie = getClosestToKillZombie();
            System.out.println(closestZombie.nextX + " " + closestZombie.nextY); // Your destination coordinates
        }
    }

    Zombie getClosestToKillZombie() {
        Zombie closestZombiePossibleToKill = null;
        Zombie closestZombie = null;
        double closestDistance = Double.MAX_VALUE;
        for (int z = 0; z < zombies.length; z++) {
            for (int h = 0; h < humans.length; h++) {
                Zombie zombie = zombies[z];
                double zombieDistanceFromHuman = getDistance(zombie, humans[h]);
                //boolean qqqq = getDistance(zombie, hero) > 1000; // todo to next zombie coord
                if (zombieDistanceFromHuman < closestDistance && zombieDistanceFromHuman > 400) {
                    closestZombiePossibleToKill = zombies[z];
                    closestDistance = zombieDistanceFromHuman;
                } else if (zombieDistanceFromHuman < closestDistance) {
                    closestZombie = zombies[z];
                }
            }
        }

        return closestZombiePossibleToKill != null ? closestZombiePossibleToKill : closestZombie;
    }

//    Zombie getClosestToAHumanZombie() {
//        Zombie closestZombie = null;
//        double closestDistance = Double.MAX_VALUE;
//        for (int z = 0; z < zombies.length; z++) {
//            for (int h = 0; h < humans.length; h++) {
//                double dist = getDistance(zombies[z], humans[h]);
//                if (dist < closestDistance) {
//                    closestZombie = zombies[z];
//                    closestDistance = dist;
//                }
//            }
//        }
//        return closestZombie;
//    }

    static double getDistance(Creature c1, Creature c2) {
        return Math.sqrt((c1.getX() - c2.getX()) * (c2.getX() - c2.getX()) + (c1.getY() - c2.getY()) * (c1.getY() - c2.getY()));
    }

    interface Creature {
        int getX();

        int getY();
    }

    class Hero implements Creature {
        int x;
        int y;

        public Hero(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }
    }

    class Human implements Creature {
        int id;
        int x;
        int y;

        public Human(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "id=" + id +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }
    }

    class Zombie implements Creature {
        int id;
        int x;
        int y;
        int nextX;
        int nextY;

        public Zombie(int id, int x, int y, int nextX, int nextY) {
            this.id = id;
            this.x = x;
            this.y = y;
            this.nextX = nextX;
            this.nextY = nextY;
        }

        @Override
        public String toString() {
            return "Zombie{" +
                    "id=" + id +
                    ", x=" + x +
                    ", y=" + y +
                    ", nextX=" + nextX +
                    ", nextY=" + nextY +
                    '}';
        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }
    }
}
