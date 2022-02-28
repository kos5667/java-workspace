package org.jhp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"org.jhp"})
@ComponentScan(basePackages = {"org.jhp"})
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				logger.info("=== application propertie ===");
			}
		};
	}
}
