package com.sample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.bo.VaccineInfo;
import com.sample.view.View;

public interface IVaccineRepo extends JpaRepository<VaccineInfo, Integer> 
{
	
	public  <T extends View>List<T> findByCountry(String vaccineName, Class<T> cls);

	public List<VaccineInfo> findByPrice(Integer price);
   
   	//public List<VaccineInfo> findByCountry(String countryName);
	
//   public List<VaccineInfo> findByCountryIs(String countryName);
	
   public List<VaccineInfo> findByCountryEquals(String countryName);
	
   public List<VaccineInfo> findByPriceLessThan(Integer price);
   
   
   public List<VaccineInfo> findByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer 
		   staringPrice, Integer endPrice);
  
   
}
