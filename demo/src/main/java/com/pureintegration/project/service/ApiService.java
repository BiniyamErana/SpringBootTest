package com.pureintegration.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pureintegration.project.domain.ApiData;
import com.pureintegration.project.repository.ApiRepository;

@Service
public class ApiService {
	
	@Autowired
	private ApiRepository apiRepository; 
	
	public List<ApiData> getAll() {
		return apiRepository.findAll();
	}

	public void save(List<ApiData> api) {
		apiRepository.saveAll(api);
		
	}
	
}
