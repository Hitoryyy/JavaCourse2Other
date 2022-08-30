package HomeWork1.CatManRobot;

public class Robot implements Treadmill, Wall {

    private String name;

    private int runLimit;

    private int jumpLimit;

    public Robot(){
    }

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int runningTread(int run) {
        if (run > getRunLimit()) {
            System.out.println("Робот столько не пробежит - сломается !");
            return 0;
        }
        System.out.println("Робот пробежал " + run);
        return run;
    }

    @Override
    public int jumpingWall(int jump) {
        if (jump > getJumpLimit()) {
            System.out.println("Этот робот через стену высотой: " + jump + " не перепрыгнет - не хватит энергии");
            return 0;
        }
        System.out.println("Робот перепрыгул через стену высотой: " + jump);
        return jump;
    }
}
