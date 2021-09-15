package com.pureintegration.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pureintegration.project.domain.ApiData;

@Repository
public interface ApiRepository extends JpaRepository<ApiData, Long>{

}
