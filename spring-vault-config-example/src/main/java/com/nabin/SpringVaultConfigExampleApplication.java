package com.nabin;


import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class SpringVaultConfigExampleApplication implements CommandLineRunner{
	
	private Credential credential;
	
	private Logger logger = LoggerFactory.getLogger(SpringVaultConfigExampleApplication.class);

	public SpringVaultConfigExampleApplication(Credential credential) {
		this.credential = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultConfigExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("------------------------------------");
		logger.info("UserName: "+credential.getUserName());
		logger.info("Password: "+credential.getPassword());

	}

}
