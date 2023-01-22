package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the power of the Locomotive:");
        int power = scanner.nextInt();
        Locomotive locomotive = new Locomotive(power);

        List<Car> cars = new ArrayList<>();
        while (true) {
            System.out.println("Enter the type of wagon (P for Passenger, F for Freight, Q for quit):");
            String type = scanner.next();
            if (type.equalsIgnoreCase("Q")) break;
            System.out.println("Enter the capacity of the car:");
            int capacity = scanner.nextInt();
            if (type.equalsIgnoreCase("P")) {
                System.out.println("Enter the class type of the passenger car:");
                int classType = scanner.nextInt();
                cars.add(new PassengerCar(capacity, classType));
            } else if (type.equalsIgnoreCase("F")) {

                cars.add(new FreightCar(capacity, 0));
            }
        }

        Train train = new Train(locomotive, cars);// Setting the passenger count and cargo weight for the cars
        for (Car car : cars) {
            if (car instanceof PassengerCar) {
                System.out.println("Enter the passenger count for the passenger car:");
                int passengerCount = scanner.nextInt();
                car.setPassengerCount(passengerCount);
            } else if (car instanceof FreightCar) {
                System.out.println("Enter the cargo weight for the freight car:");
                int cargoWeight = scanner.nextInt();
                ((FreightCar) car).setCargoWeight(cargoWeight);
            }
        }

        System.out.println("Enter the speed of the Locomotive:");
        int speed = scanner.nextInt();
        locomotive.setSpeed(speed);

        train.displayTrainInfo();
    }
}
