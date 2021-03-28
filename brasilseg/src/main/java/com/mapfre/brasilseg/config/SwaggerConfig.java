package com.mapfre.brasilseg.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	//Classe docket tivemos que criar com a@bean devido ser uma classe externa onde colocamos aquelas 2 dependencias do swagger
	// Url do swagger http://localhost:8099/swagger-ui.html

	@Bean
	public Docket BrasilSeg() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.mapfre.brasilseg"))
				.paths(regex("/api/1.0.*"))
				.build()
				.apiInfo(metaInfo());
		
	}
	



	private <VersionExtesion> ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"API Recustração BrasilSeg - TARCISIO", 
				"Resconstrui a API BRASILSEG Para facilitar os testes de retorno e entrada)", 
				"1.0", 
				"terms Of ServiceUrl", 
				 new Contact("Tarcisio Moreira","www.google.com", "Tarcisioms23@hotmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
	        );
		
		return apiInfo;
	}
	
}
