package dev.andrejducho.spring;

public class SummerTiresService implements TiresService {

    @Override
    public String usedTires() {
        return "I have summer tires";
    }
}
