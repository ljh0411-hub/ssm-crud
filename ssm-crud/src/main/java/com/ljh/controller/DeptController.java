package com.ljh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020��5��22�� ����9:32:12

 */
@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@RequestMapping("/test")
	public String test() {
		return "success";
	}
	
	/**
	 * ��ת����index.jsp
	 */
	
}
