package com.india.Spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name="sno")
	int sno;
	
	@Column(name="code")
	int code;
	
	String name;
	String population;
	 public Country()
	 {
		 
	 }
	 public Country(int sno,int code,String name,String population)
	 {
		 this.sno=sno;
		 this.code=code;
		 this.name=name;
		 this.population=population;
	 }
	 
	 public void setSno(int sno)
	 {
		 this.sno=sno;
	 }
	 public int getSno()
	 {
		 return sno;
	 }
	 
	 public void setCode(int code)
	 {
		 this.code=code;
	 }
	 public int getCode()
	 {
		 return code;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setPopulation(String population)
	 {
		 this.population=population;
	 }
	 public String getPopulation()
	 {
		 return population;
	 }
}
