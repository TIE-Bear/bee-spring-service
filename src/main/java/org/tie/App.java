package org.tie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author Demin Daniil
 * @since 04.12.2021
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class App {
    public static void main( String[] args ) { SpringApplication.run(App.class, args); }
}
