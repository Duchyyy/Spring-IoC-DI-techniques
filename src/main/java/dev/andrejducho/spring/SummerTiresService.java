package dev.andrejducho.spring;

import org.springframework.stereotype.Component;

@Component
public class SummerTiresService implements TiresService {

    @Override
    public String usedTires() {
        return "I have summer tires";
    }
}
