package com.ljh.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljh.bean.Department;
import com.ljh.bean.Employee;
import com.ljh.dao.DeptMapper;
import com.ljh.service.DeptService;
import com.ljh.service.EmpService;

/**
 * @description: 测试dao层的工作
 * @author: ljh
 * @date: Created in 2020年5月21日 下午5:14:17

 */
public class MapperTest {
	
//	@Test
//	public void testSaveDept() {
//		//1.创建springioc容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2.从容器中获取mapper
//		DeptService deptSercice = (DeptService) ac.getBean("deptService");
//		//3.调用方法
//		Department department = new Department(null,"运营部");
//		deptSercice.saveDept(department);
//		
//		//插入几个部门
////		departmentMapper.insertSelective(new Department(null,"开发部"));
////		departmentMapper.insertSelective(new Department(null,"测试部"));
//				
//	}
	
	@Test
	public void testEmp() {
		//1.创建springioc容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从容器中获取mapper
		EmpService empService = (EmpService) ac.getBean("empService");
		//3.调用方法
		List<Employee> list = empService.findAll();
		for(Employee i:list) {
			System.out.println(i);
		}
	}
}

