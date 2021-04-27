package com.india.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.india.Spring.Dao.CountryDao;
import com.india.Spring.Model.Country;

public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryDao countryDao;
	
	public void save(Country country)
	{
		countryDao.save(country);
	}
	
	public void update(Country country)
	{
		countryDao.update(country);
	}
	public Country getId(int sno)
	{
		return countryDao.getId(sno);
	}
	public void delete(int sno)
	{
		countryDao.delete(sno);
	}
	public List<Country> getAll()
	{
		return countryDao.getAll();
	}

	

}
