package Blackpearlbanking;

//these are the dependencies that are needed for the setup of Spring
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//this annotates the class where the spring boot starts.
public class Blackpearlbanking {

    public static void main(String[] args) {

        SpringApplication.run(Blackpearlbanking.class, args);
        //Sets up default configuration for app
        //starts Spring application context
        //Performs class path scan
        //starts Tomcat server
    }
}
