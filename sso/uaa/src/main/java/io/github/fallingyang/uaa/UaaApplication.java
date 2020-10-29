package io.github.fallingyang.uaa;

import io.github.fallingyang.uaa.config.ApplicationProperties;
import io.github.fallingyang.uaa.config.listener.PropertiesLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author yangzifeng
 */
@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class UaaApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(UaaApplication.class);
		springApplication.addListeners(new PropertiesLogger());
		springApplication.run(args);
	}

}

