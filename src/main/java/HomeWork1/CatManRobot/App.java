package HomeWork1.CatManRobot;

public class App {
    public static void main(String[] args) {

        Man man = new Man("человек_1",500, 3);
        Man man1 = new Man("человек_2",250,5);
        Man man2 = new Man("человек_3",222, 2);

        Cat cat = new Cat("кот_1", 30, 1);
        Cat cat1 = new Cat("кот_2", 123, 1);
        Cat cat2 = new Cat("кот_3", 398, 2);

        Robot robot = new Robot("робот_1",30, 6);
        Robot robot1 = new Robot("робот_2",1232, 1);
        Robot robot2 = new Robot("робот_3",223, 8);


        Treadmill[] treadmills = new Treadmill[] {man, man1, man2, cat, cat1, cat2, robot, robot1, robot2};

        Wall[] walls = new Wall[] {man, man1, man2, cat, cat1, cat2, robot, robot1, robot2};

        for (Treadmill treadmill : treadmills) {
            treadmill.runningTread(300);

        }

        System.out.println();
        System.out.println();

        for (Wall wall : walls) {
            wall.jumpingWall(2);
        }
    }
}
