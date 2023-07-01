package web.models;

public class Car {
    String model;
    int year;
    String country;

    public Car() {
    }

    public Car(String model, int year, String country) {
        this.model = model;
        this.year = year;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
