package kz.aitu.oop.practice.practice2;

class Locomotive {
    private int power;
    private int speed;

    public Locomotive(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void decelerate() {
        if (speed >= 10) {
            speed -= 10;
        }
    }

    public void display() {
        System.out.println("Locomotive with power: " + power + " and speed: " + speed);
    }
}
