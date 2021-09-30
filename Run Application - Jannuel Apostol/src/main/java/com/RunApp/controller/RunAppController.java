package com.RunApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.RunApp.model.City;
import com.RunApp.service.RunService;

@Controller
public class RunAppController {

	@Autowired
	RunService rtService;
	
	@GetMapping("/addrunners")
	public String addRunnersView(Model model) {
		List<City> cityList = rtService.showCityList();
		model.addAttribute("cityList", cityList);
		return "addRunner";
	}
	
	@GetMapping("/runner/{runnerid}/distance")
	public String getTotalDistance(@PathVariable(name = "runnerid") int id, Model model) {
		List<Integer> distList = rtService.getTotalDistance(id);
		int total = distList.stream().mapToInt(Integer::intValue).sum();
		model.addAttribute("distance", total);
		return "runnerdistance";
	}
}
