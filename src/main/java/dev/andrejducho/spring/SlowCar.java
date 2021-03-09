package dev.andrejducho.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SlowCar implements Car{

    private String brand;
    private String owner;
    private String plateNumber;

    @Autowired
    @Qualifier("winterTiresService")
    private TiresService tiresService;

    public SlowCar() {

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
