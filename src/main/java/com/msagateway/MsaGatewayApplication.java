package com.msagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author Pablo
 *
 */
@SpringBootApplication
@EnableConfigServer
public class MsaGatewayApplication {

	public static void main(String[] args) {
		System.setProperty("log4j.defaultInitOverride", "true");
		SpringApplication.run(MsaGatewayApplication.class, args);
	}

}
