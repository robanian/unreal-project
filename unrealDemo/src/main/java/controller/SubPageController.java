package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubPageController {
	// Test Area
	
	@RequestMapping(value="/unrealtest")
	public String unrealTest() {
		return "test/UnrealMain";
	}
	
	@RequestMapping(value="/maintest")
	public String mainTest() {
		return "test/maintest";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "test/test";
	}
	
	@RequestMapping(value="/test2")
	public String test2() {
		return "test/test2";
	}
	
	@RequestMapping(value="/p")
	public String pixel() {
		return "test/PixelDemo";
	}
	
	@RequestMapping(value="/image-1.html")
	public String image1() {
		return "test/image-1";
	}
	
	@RequestMapping(value="/image-2.html")
	public String image2() {
		return "test/image-2";
	}
	
	@RequestMapping(value="/image-3.html")
	public String image3() {
		return "test/image-3";
	}
}
