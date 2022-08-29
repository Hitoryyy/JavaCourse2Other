package HomeWork1.CatManRobot;

public class Man implements Treadmill, Wall {

    private String name;

   public Man() {
   }

    public Man(String name) {
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
        System.out.println(getName() + " перепрыгнул через стену");
    }
}
