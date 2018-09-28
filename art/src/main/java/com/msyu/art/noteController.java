package com.msyu.art;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class noteController {
	
	@RequestMapping("/note")
	public String list(){
			System.out.println("notecontroller");
		
		return "note/list";
	}
	
	@RequestMapping("/check")
	public String check(){
			System.out.println("check");
		
		return "note/check";
	}

}
