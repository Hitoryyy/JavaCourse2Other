package HomeWork1.CatManRobot;

public class Cat implements Treadmill, Wall {

    private String name;

    private int runningLimit;

    private int jumpLimit;

    public Cat(){
    }

    public Cat(String name, int runningLimit, int jumpLimit) {
        this.name = name;
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunningLimit() {
        return runningLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int runningTread(int run) {
        if (run > getRunningLimit()) {
            System.out.println("Кот столько пробежать не сможет");
            return 0;
        }
        System.out.println("Кот пробежал " + run);
        return run;
    }

    @Override
    public int jumpingWall(int jump) {
        if (jump > getJumpLimit()) {
            System.out.println("Коты через стену прыгать не умеют");
            return 0;
        }
        System.out.println("Коты высоко прыгать не умеют, но высоту: " + jump + " он возьмёт");
        return jump;
    }
}
