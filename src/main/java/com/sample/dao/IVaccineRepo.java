package com.sample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.bo.VaccineInfo;
import com.sample.view.View;

public interface IVaccineRepo extends JpaRepository<VaccineInfo, Integer> 
{
	
	public  <T extends View>List<T> findByCountry(String vaccineName, Class<T> cls);
  
   
}
