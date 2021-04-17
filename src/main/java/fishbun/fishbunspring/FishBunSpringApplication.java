package fishbun.fishbunspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FishBunSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishBunSpringApplication.class, args);
	}

}

//@SpringBootApplication
//public class FishBunSpringApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ServletInitializer.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServletInitializer.class, args);
//	}
//
//}
