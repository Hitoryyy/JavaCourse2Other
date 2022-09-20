package Lesson_3.CheckTrucks;

public class App {
    public static void main(String[] args) {

        BridgeOfficer officer = new BridgeOfficer(11000);

        Truck truck = new Truck(10000);
        Truck truck1  = new Truck(14000);
        Truck truck2 = new Truck(13000);

        System.out.println("Грузовик № 1: Офицер, я могу проехать?");
        boolean canFirstTruckGo = officer.checkTruck(truck);

        System.out.println("Грузовик № 2: Офицер, я могу проехать?");
        boolean canSecondTruckGo = officer.checkTruck(truck1);

        System.out.println("Грузовик № 3: Офицер, я могу проехать?");
        boolean canThreeTruckGo = officer.checkTruck(truck2);
    }
}
