package Revision;

public interface Vehicle {

	String getBrand();

	String getSpeed();

	double getPrice();

}

class Car implements Vehicle {

    private String brand;
    private String speed;
    private double price;

    public Car(String brand, String speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public double getPrice() {
        return price;
    }

}