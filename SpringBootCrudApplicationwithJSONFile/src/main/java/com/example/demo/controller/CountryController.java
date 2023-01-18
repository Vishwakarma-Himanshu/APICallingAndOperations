package com.example.demo.controller;

import java.util.stream.Collectors;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Country;
import com.google.gson.Gson;
import com.google.gson.reflect.*;

@RestController
public class CountryController {
	
	@GetMapping(value = "/callcountry")
	public Object getCountry() {
		String uri = "https://cloudfinch-public.s3.ap-south-1.amazonaws.com/countries.json";
    	RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		 List<Country> str = new ArrayList<Country>();

		 str = new Gson().fromJson(result, new TypeToken<List<Country>>() {}.getType());
		 
		  // sort according to area size
		 
			/*
			 * Collections.sort(str,
			 * Comparator.comparingDouble(Country::getArea).reversed());
			 * 
			 * HashMap<String, Double> str1 = new HashMap<String, Double>(); for(int i =0;
			 * i< str.size(); i++){ str1.put(str.get(i).getRegion(), str.get(i).getArea());
			 * }
			 * 
			 * return str1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.
			 * comparingByKey())).limit(5).collect(Collectors.toList());
			 */
		 
		 
	return solve(str);
	}
	
	// iterate over object list
	public static Map<String, List<Country>> solve(List<Country> obj) {
		Map<String, List<Country>> map = new HashMap<>();
		 for(Country o: obj) {
			 
			 // map all continent with their object
			 if(map.containsKey(o.getRegion())) {
				 List<Country> f = map.get(o.getRegion());
				 f.add(o);
				 map.put(o.getRegion(), f);
			 }else {
				 List<Country> newList = new ArrayList<>();
				 map.put(o.getRegion(), newList);
			 }
		 }
		 
		// now we have divide all continent with their object
		 List<Country> countryList= new ArrayList<>();
		 for(Map.Entry<String, List<Country>> entry: map.entrySet()) {
			 // iterate one by one on every list
			 countryList = entry.getValue();
			 // sort a list according to area
			 Collections.sort(countryList, Comparator.comparingDouble(Country::getArea).reversed());
			// Collections.sort(countryList, (a, b) -> b.getArea() - a.getArea());
			 // find first 5 and return
			 if(countryList.size()>5) {
				 countryList.subList(5,countryList.size()).clear();
			 }
		 }
		return map;
	}
	
}
