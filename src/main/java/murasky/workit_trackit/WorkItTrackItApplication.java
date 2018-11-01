package murasky.workit_trackit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("murasky.workout.repository")
public class WorkItTrackItApplication {

    public static void main(String[] args){
        SpringApplication.run(WorkItTrackItApplication.class, args);
    }

}
