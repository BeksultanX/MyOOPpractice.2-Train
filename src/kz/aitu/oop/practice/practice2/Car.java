package kz.aitu.oop.practice.practice2;

abstract class Car {
    private int capacity;
    private int passengerCount;

    public Car(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount <= capacity) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Error: Cannot set passenger count higher than capacity of the car.");
        }
    }

    public abstract void display();
}

