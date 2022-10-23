package rc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"rc.persistence","rc.domain","rc.web"})
//@EnableJpaRepositories(basePackages = {"rc.persistence"})
//@EntityScan(basePackages = {"rc.domain"})
@ComponentScan(basePackages = {"rc"})
@EnableJpaRepositories(basePackages = {"rc"})
@EntityScan(basePackages = {"rc"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
