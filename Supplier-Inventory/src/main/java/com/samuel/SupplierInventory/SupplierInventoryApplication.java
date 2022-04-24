package com.samuel.SupplierInventory;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SupplierInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierInventoryApplication.class, args);
	}
	@Bean
	public Docket swaggerConfig()
	{
		return new Docket(DocumentationType.SWAGGER_2)//step (1)it is just creating new Docket instance of ducument type that is configured to use swagger2
	               .select() 
	               .apis(RequestHandlerSelectors.basePackage("com.samuel.SupplierInventory"))//(4) giving thebase pakage //both 3 and 4 will eliminate the 1st problem
	               .build()
	               .apiInfo(apiDetails());	
	}
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"PharmacyManagement Drug API",
				"Drug",
				"1.0",
				"free to use",
				new springfox.documentation.service.Contact("Samuel Murari", "http:/javabrains.io+", "a@b.com"),
				"API License",
				"http://javabrains.in",
				Collections.emptyList()
				
				);
}
}
