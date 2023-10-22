package ie.atu.week5exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week5ExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week5ExerciseApplication.class, args);
    }

}
