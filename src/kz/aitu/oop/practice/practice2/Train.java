package kz.aitu.oop.practice.practice2;

import java.util.List;

class Train {
    private Locomotive locomotive;
    private List<Car> cars;
    private int totalCapacity;
    private int totalPassengerCount;

    public Train(Locomotive locomotive, List<Car> cars) {
        this.locomotive = locomotive;
        this.cars = cars;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();

        }
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getTotalPassengerCount() {
        totalPassengerCount = 0;
        for (Car car : cars) {
            if (car instanceof PassengerCar) {
                totalPassengerCount += car.getPassengerCount();
            }
        }
        return totalPassengerCount;
    }

    public void displayTrainInfo() {
        System.out.println("Train Information: ");
        System.out.println("-------------------");
        locomotive.display();
        for (Car car : cars) {
            car.display();
        }
        System.out.println("Total capacity of the train: " + totalCapacity);
        System.out.println("Total passenger count of the train: " + getTotalPassengerCount());
    }
}
