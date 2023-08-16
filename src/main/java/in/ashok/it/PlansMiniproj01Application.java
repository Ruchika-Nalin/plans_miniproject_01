package in.ashok.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PlansMiniproj01Application {

	public static void main(String[] args) {
		SpringApplication.run(PlansMiniproj01Application.class, args);
	}

}
