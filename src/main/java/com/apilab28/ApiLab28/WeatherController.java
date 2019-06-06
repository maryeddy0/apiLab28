package com.apilab28.ApiLab28;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apilab28.ApiLab28.entiity.Location;
import com.apilab28.ApiLab28.entiity.Weather;

@Controller
public class WeatherController {
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView weather() {
//		Weather w = rt.getForObject(
//				"https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json", Weather.class);
	return new ModelAndView("index");

	}
	
	
	@RequestMapping("/forcast")
	public ModelAndView forcast(@RequestParam("latitude") double lat, @RequestParam ("longitude") double lon) {
Location l = new Location (lat,lon);
		return new ModelAndView("weather", "forcast", l);
	}

}
