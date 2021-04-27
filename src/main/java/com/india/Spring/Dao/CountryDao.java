package com.india.Spring.Dao;

import java.util.List;

import com.india.Spring.Model.Country;

public interface CountryDao {
	
	public void save(Country country);
	public void update(Country country);
	public Country getId(int sno);
	public void delete(int sno);
	public List<Country> getAll();

}
