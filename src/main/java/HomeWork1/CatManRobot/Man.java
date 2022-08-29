package HomeWork1.CatManRobot;

public class Man implements Treadmill, Wall {

    private String name;

    private int runningLimit;

    private int jumpLimit;

   public Man() {
   }

    public Man(String name, int runningLimit, int jumpLimit) {
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
            System.out.println("Человек столько не пробежит");
            return 0;
        }
        System.out.println("Человек пробежал " + run);
       return run;
    }

    @Override
    public int jumpingWall(int jump) {
        if (jump > getJumpLimit()) {
            System.out.println("Человек настолько высоко не прыгнет");
            return 0;
        }
        System.out.println("Человек перепрыгнул стену высотой: " + jump);
        return jump;
    }
}
