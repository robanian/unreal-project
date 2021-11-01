package com.thezoom.works;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public String main() {
		return "index";
	}
	
	@RequestMapping(value="/index.html")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping(value="/image-1.html")
	public String image1() {
		return "image-1";
	}
	
	@RequestMapping(value="/image-2.html")
	public String image2() {
		return "image-2";
	}
	
	@RequestMapping(value="/image-3.html")
	public String image3() {
		return "image-3";
	}
	
	// Test Area
	
	@RequestMapping(value="/maintest")
	public String maintest() {
		return "maintest";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="/test2")
	public String test2() {
		return "test2";
	}
	
	@RequestMapping(value="/p")
	public String pixel() {
		return "PixelDemo";
	}
}
