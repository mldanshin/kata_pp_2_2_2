package web.models;

public class Car {
    private final String model;
    private final String year;
    private final String color;

    public Car(String model, String year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
