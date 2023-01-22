package kz.aitu.oop.practice.practice2;

class PassengerCar extends Car {
    private int classType;

    public PassengerCar(int capacity, int classType) {
        super(capacity);
        this.classType = classType;
    }

    public int getClassType() {
        return classType;
    }

    public void setClassType(int classType) {
        this.classType = classType;
    }

    @Override
    public void display() {
        System.out.println("Passenger car with class type: " + classType + " and passenger count: " + getPassengerCount());
    }
}
