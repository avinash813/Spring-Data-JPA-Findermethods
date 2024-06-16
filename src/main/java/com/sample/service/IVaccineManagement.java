package com.sample.service;

import java.util.Collection;
import java.util.List;


import com.sample.bo.VaccineInfo;
import com.sample.view.View;

public interface IVaccineManagement 
{
	public  <T extends View>List<T> fetchByCountry(String vaccineName, Class<T> cls);
	
}
