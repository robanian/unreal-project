package com.thezoom.works;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public String main() {
		return "index";
	}
}
