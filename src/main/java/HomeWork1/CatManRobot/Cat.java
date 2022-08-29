package HomeWork1.CatManRobot;

public class Cat implements Treadmill, Wall {

    private String name;

    public Cat(){
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void runningTread() {
        System.out.println(getName() + " пробежал на беговой дорожке");
    }

    @Override
    public void jumpingWall() {
        System.out.println(getName() + " коты не умеют прыгать через стены");
        return;
    }
}
