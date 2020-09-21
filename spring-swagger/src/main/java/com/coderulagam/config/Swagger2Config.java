package com.coderulagam.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {
	
	@Bean
	public Docket swaggerConfig() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.build()
				.apiInfo(new ApiInfo("movies api", "movie management api description", 
						"1.0", "http://coderulagam.com/termsofuse", 
						new Contact("name", "url", "info@coderulagam.com"), 
						"opensource", "http://coderulagam.com/license", 
						Collections.emptyList()));

	}

}
