package dev.andrejducho.spring;

import org.springframework.beans.factory.annotation.Value;

public class FastCar implements Car{

    private String brand;
    private String owner;
    @Value("${name.plateNumber}")       //inject value from application.properties
    private String plateNumber;

    private TiresService tiresService;

    public FastCar(TiresService tiresService) {
        this.tiresService = tiresService;
    }

    @Override
    public String thisCarIs() {
        return "This car is pretty fast.";
    }

    @Override
    public String getRightTires() {
        System.out.println(getPlateNumber());
        return tiresService.usedTires();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getOwner() {
        return owner;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
