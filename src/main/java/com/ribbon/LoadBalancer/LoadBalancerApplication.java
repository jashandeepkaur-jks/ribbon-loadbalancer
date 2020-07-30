package com.ribbon.LoadBalancer;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerApplication.class, args);
	}
	
	@Value("${server.port}")
	private int port ; 
	
	@GetMapping
	public String getTime()
	{
		return "Current time is " + new Date().toString()
				+" Answer by service running on "+ port ;
	}

}
