package no.havard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("no.havard")
public class SimpleBootCxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootCxfApplication.class, args);
    }
}
