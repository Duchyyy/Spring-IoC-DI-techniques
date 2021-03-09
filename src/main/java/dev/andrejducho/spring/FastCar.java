package dev.andrejducho.spring;

public class FastCar implements Car{

    private String brand;
    private String owner;
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
}
