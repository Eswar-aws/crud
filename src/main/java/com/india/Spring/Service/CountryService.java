package com.india.Spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.india.Spring.Model.Country;

public interface CountryService {
	
	public void save(Country country);
	public void update(Country country);
	public Country getId(int sno);
	public void delete(int sno);
	public List<Country> getAll();

}
