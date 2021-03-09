package dev.andrejducho.spring;

public class SlowCar implements Car{

    private String brand;
    private String owner;
    private String plateNumber;

    private TiresService tiresService;

    public SlowCar(TiresService tiresService) {
        this.tiresService = tiresService;
    }

    @Override
    public String thisCarIs() {
        return "This is slow car";
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
