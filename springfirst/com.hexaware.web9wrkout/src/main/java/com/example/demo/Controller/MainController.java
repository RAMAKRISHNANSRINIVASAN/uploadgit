package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/sales")
	public String sales()
	{
		return "sales";
	}
	@GetMapping("/marketing")
	public String marketing()
	{
		return "marketing";
	}
	@GetMapping("/laptops")
	public String laptops()
	{
		return "laptops";
	}
	@GetMapping("/tv_sales")
	public String tv_sales()
	{
		return "tv_sales";
	}

}
