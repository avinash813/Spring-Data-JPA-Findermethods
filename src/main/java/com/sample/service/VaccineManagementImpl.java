package com.sample.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.sample.bo.VaccineInfo;
import com.sample.dao.IVaccineRepo;
import com.sample.view.View;

@Service
public class VaccineManagementImpl implements IVaccineManagement {

	@Autowired
	private IVaccineRepo repo;

	@Override
	public  <T extends View>List<T> fetchByCountry(String vaccineName, Class<T> cls) {
		
		return repo.findByCountry(vaccineName, cls);
	}

	@Override
	public List<VaccineInfo> searchByVaccinePrice(Integer price) {
		System.out.println("My CustomFinder method implemented by " + repo.getClass().getName());
		
		List<VaccineDetails> list =repo.findByPrice(price);
	

		return list;	
	}

	@Override
	public List<VaccineInfo> searchByCountryName(String countryName) {
//		return repo.findByCountry(countryName);
		//return repo.findByCountryIs(countryName);
		return repo.findByCountryEquals(countryName);
		
		
	}

	@Override
	public List<VaccineInfo> searchByPriceLessThan(Integer price) {
	
		return  repo.findByPriceLessThan(price);
	}

	@Override
	public List<VaccineInfo> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer staringPrice,
			Integer endPrice) {
		
		return repo.findByVaccineNameInAndPriceBetween(vaccines, staringPrice, endPrice);
	}
	




	
	
}
