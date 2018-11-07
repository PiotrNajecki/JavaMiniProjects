package pl.sda.pl.sda.beverage;

import java.time.LocalDate;

/**
 * Created by TOSHIBA-L775 on 2018-02-22.
 */
public class Beverage {

    private double price;
    private double capacity;
    private String name;
    private LocalDate expireDate;

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(BeverageType beverageType) {
        this.beverageType = beverageType;
    }

    private BeverageType beverageType;

    public Beverage(double price, double capacity, String name, LocalDate expireDate, BeverageType beverageType) {
        this.price = price;
        this.capacity = capacity;
        this.name = name;
        this.expireDate = expireDate;
        this.beverageType = beverageType;

    }

    @Override
    public String toString() {
        return "Beverage{" +
                "price=" + price +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", expireDate=" + expireDate +
                ", beverageType=" + beverageType +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}