package com.india.Spring.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.india.Spring.Model.Country;

@Repository
public class CountryDaoImpl implements CountryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public CountryDaoImpl()
	{
	}
	
	public CountryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void save(Country country)
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(country);
	}
	
	@Transactional
	public void update(Country country)
	{
		Session session=sessionFactory.getCurrentSession();
		session.update(country);
	}
	
	@Transactional
	public Country getId(int sno)
	{
		Session session=sessionFactory.getCurrentSession();
		Country country=(Country)session.get(Country.class,new Integer(sno));
		return country;	
	}

	@Transactional
	public void delete(int sno)
	{
		Session session=sessionFactory.getCurrentSession();
		Country country=(Country)session.load(Country.class, new Integer(sno));
		session.delete(country);
	}
	
	@Transactional
	public List<Country> getAll()
	{
		Session session=sessionFactory.getCurrentSession();
		Query qry=session.createQuery("from Country");
		List<Country> l=qry.list();
		return l;
	}
}
