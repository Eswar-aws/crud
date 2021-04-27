package com.india.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.india.Spring.Model.Country;
import com.india.Spring.Service.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value="/addcount")
	public String addc(Model m)
	{
		Country c=new Country();
		 m.addAttribute("country",c);
		 return "addcountry";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savec(@ModelAttribute Country count,BindingResult br)
	{
		countryService.save(count);
		System.out.println("save sucessuflly");
		return "redirect:/view";
		
	}
	
	@RequestMapping(value="/edit/{sno}")
	public String editc(@PathVariable int sno,Model m)
	{
		
		m.addAttribute("count",this.countryService.getId(sno));
		//m.addAttribute("lists",this.countryService.getAll());
		return "update";
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String updatec(@ModelAttribute("count") Country count)
	{
		countryService.update(count);
		return "redirect:/view";
	}
	@RequestMapping(value="/delete/{sno}",method=RequestMethod.GET)
	public String deletec(@PathVariable int sno)
	{
		countryService.delete(sno);
		return "redirect:/view";
	}
	@RequestMapping(value="/view")
	public String viewc(Model m)
	{
		List<Country> list=countryService.getAll();
		m.addAttribute("list",list);
		return "viewcountry";
		
	}
}
