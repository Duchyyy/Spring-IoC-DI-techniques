package dev.andrejducho.spring;

import org.springframework.stereotype.Component;

@Component
public class WinterTiresService implements TiresService {

    @Override
    public String usedTires() {
        return "I have winter tires";
    }
}
