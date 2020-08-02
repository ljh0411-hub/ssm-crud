package com.ljh.controller;
/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020年5月22日 下午1:16:15

 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ljh.bean.Employee;
import com.ljh.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	/**
	 * 查询所有数据
	 */
	@RequestMapping("/list")
	public String getList(Model model){
		List<Employee> list = empService.findAll();
		model.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping("/goUpdate")
	public String goUpdate(Integer id,Model model) {
		Employee employee = empService.findById(id);
		model.addAttribute("employee", employee);
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(Employee employee) {
		empService.update(employee);
		return "redirect:list";
	}
	
	@RequestMapping("/del")
	public String del(Integer emp_id) {
		empService.del(emp_id);
		return "redirect:list";
	}
	
	@RequestMapping("/goAdd")
	public String goAdd() {
		return "add";
	}
	
	@RequestMapping("/add")
	public String insert(Employee employee) {
		empService.insert(employee);
		return "redirect:list";
	}
	
	/**
	 * 微信获取数据测试
	 */
	@GetMapping("/weixin")
	public void getWeiXin(String username,String password,HttpServletResponse resp){
		System.out.println("username="+username+" ,password="+password);
		List<Employee> list = empService.findAll();
		ObjectMapper objectMapper = new ObjectMapper();
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		try {
			String str = "";
			str = objectMapper.writeValueAsString(list);
			PrintWriter out = resp.getWriter();
			out.print(str);
			out.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
}
