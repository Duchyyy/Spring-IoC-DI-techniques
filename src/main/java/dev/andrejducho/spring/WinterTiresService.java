package dev.andrejducho.spring;

public class WinterTiresService implements TiresService {

    @Override
    public String usedTires() {
        return "I have winter tires";
    }
}
