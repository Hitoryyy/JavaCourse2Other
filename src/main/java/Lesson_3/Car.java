package Lesson_3;

import java.util.Objects;

public class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && yearOfManufacture == car.yearOfManufacture && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, yearOfManufacture);
    }

    public static void main(String[] args) {
        Car car = new Car("Ferrari 360 Spider", 280, 1996);
        Car car1 = new Car("Ferrari 360 Spider", 280,1996);
        System.out.println(car.equals(car1));
    }
}
