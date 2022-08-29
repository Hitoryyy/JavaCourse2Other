package HomeWork1.CatManRobot;

public class Robot implements Treadmill, Wall {

    private String name;

    public Robot(){
    }

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void runningTread() {
        System.out.println(getName() + " робот пробежал на беговой дорожке");
    }

    @Override
    public void jumpingWall() {
        System.out.println(getName() + " робот прыгнул через стену");
    }
}
