package com.sample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.service.VaccineManagementImpl;
import com.sample.view.ResultView1;
import com.sample.view.ResultView2;
import com.sample.view.ResultView3;

@SpringBootApplication
public class SpringDataJpaFindersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFindersApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	      
		
		List<ResultView2> list1 = service.fetchByCountry("usa", ResultView2.class);
		list1.forEach(v->System.out.println(v.getId() + " : " + v.getVaccineName() + " "+ v.getCountry()));
		
		
		List<ResultView1> list2 = service.fetchByCountry("india", ResultView1.class);
		list2.forEach(v->System.out.println(v.getId() + " : "+ v.getCountry()));
		
		List<ResultView3> list3 = service.fetchByCountry("india", ResultView3.class);
		list3.forEach(c->System.out.println(c.getPrice()));
     
//	service.searchByVaccinePrice(6352).forEach(v->System.out.println(v));
//	service.searchByCountryName("India").forEach(v->System.out.println(v));
	
	//service.searchByPriceLessThan(45454).forEach(v->System.out.println(v));
	List<String> vaccines=new ArrayList<>();
	vaccines.add("pfizer");
	vaccines.add("sputnik");
	vaccines.add("Covaxin");
	
	service.searchByVaccineNameInAndPriceBetween(vaccines, 345,565745).
	forEach(v->System.out.println(v));
	
		
		context.close();
	}

}
