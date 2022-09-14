package Lesson_3.CheckTrucks;

public class BridgeOfficer {

    private int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.getWeight() > getMaxWeight()){
            System.out.println("Сожалею, не могу Вас пропустить слишком большой вес! Мост может обрушиться. Воспользуйтесь объездной дорогой.");
            return false;
        } else {
            System.out.println("Да, пожалуйста проезжайте. Счастливого пути!");
            return true;
        }
    }
}
