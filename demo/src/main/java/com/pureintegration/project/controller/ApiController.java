package com.pureintegration.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pureintegration.project.domain.ApiData;
import com.pureintegration.project.service.ApiService;

@RestController
public class ApiController {
	
	private ApiService apiService; 
	
	@RequestMapping("/all")
	public List<ApiData> getAll(){
		return apiService.getAll();
	}

}
