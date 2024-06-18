package com.sample.service;

import java.util.Collection;
import java.util.List;


import com.sample.bo.VaccineInfo;
import com.sample.view.View;

public interface IVaccineManagement 
{
	public  <T extends View>List<T> fetchByCountry(String vaccineName, Class<T> cls);

	public List<VaccineInfo> searchByVaccinePrice(Integer price);
	
	 public List<VaccineInfo> searchByCountryName(String countryName);
	 
	 public List<VaccineInfo> searchByPriceLessThan(Integer price);
     
	   public List<VaccineInfo> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer 
			   staringPrice, Integer endPrice);
	
}
