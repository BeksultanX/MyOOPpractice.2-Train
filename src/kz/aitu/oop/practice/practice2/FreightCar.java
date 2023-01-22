package kz.aitu.oop.practice.practice2;

class FreightCar extends Car {
    private int cargoWeight;

    public FreightCar(int capacity, int cargoWeight) {
        super(capacity);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void display() {
        System.out.println("Freight car with cargo weight: " + cargoWeight);
    }
}
