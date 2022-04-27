package com.samuel.Admin;

import java.util.Collections;
  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	@Bean
	public RestTemplate  getRestTemplate() {
		return new RestTemplate();
	}
	
	/*docket is an primary interface into swagger-spring-mvc-framework which provide default and conveniencw for configuration */
	@Bean
	public  Docket swaggerConfig()  
	{
		/*it is just creating new Docket instance of ducument type that is configured to use swagger2*/
		return new Docket(DocumentationType.SWAGGER_2)
				/*this method use to select apiselectorbuilder which provids a way to control the end point*/
	               .select() 
	               /* handler will scan the ase pakage and creat Api for all of the classes within it*/
	               .apis(RequestHandlerSelectors.basePackage("com.samuel.Admin"))
	               .build()
	               .apiInfo(apiDetails());	
	}
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"PharmacyManagement API",
				"Admin",
				"1.0",
				"free to use",
				new springfox.documentation.service.Contact("Samuel Murari", "http:/javabrains.io", "a@b.com"),
				"API License",
				"http://javabrains.in",
				Collections.emptyList()
				
				);
}
}
