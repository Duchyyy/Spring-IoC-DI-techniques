package dev.andrejducho.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")     //add this to use properties in your application with Value annotation
//@ComponentScan("dev.andrejducho.spring") //comented because i defined beans manually
public class AppConfig {

    @Bean   //define dependency
    public TiresService winterTiresService() {
        return new WinterTiresService();
    }
    @Bean
    public TiresService summerTiresService() {
        return new SummerTiresService();
    }

    @Bean   //fastCar is actually bean Id, and winterTiresService is injected dependency
    public Car usedCar() {
        return new FastCar(winterTiresService()); //can be changed to SlowCar
    }
}
