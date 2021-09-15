package com.pureintegration.project;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pureintegration.project.domain.ApiData;
import com.pureintegration.project.service.ApiService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ApiService apiService) {
		return args -> {
			
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<ApiData>> typeReference = new TypeReference<List<ApiData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/apidata.json");
			try {
				List<ApiData> api = mapper.readValue(inputStream,typeReference);
				apiService.save(api);
			} catch (IOException e){
				System.out.println("Unable to save the data: " + e.getMessage());
			}
		};
	}

}
