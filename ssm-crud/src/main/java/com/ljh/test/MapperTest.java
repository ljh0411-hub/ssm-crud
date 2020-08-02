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
 * @description: ����dao��Ĺ���
 * @author: ljh
 * @date: Created in 2020��5��21�� ����5:14:17

 */
public class MapperTest {
	
//	@Test
//	public void testSaveDept() {
//		//1.����springioc����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2.�������л�ȡmapper
//		DeptService deptSercice = (DeptService) ac.getBean("deptService");
//		//3.���÷���
//		Department department = new Department(null,"��Ӫ��");
//		deptSercice.saveDept(department);
//		
//		//���뼸������
////		departmentMapper.insertSelective(new Department(null,"������"));
////		departmentMapper.insertSelective(new Department(null,"���Բ�"));
//				
//	}
	
	@Test
	public void testEmp() {
		//1.����springioc����
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.�������л�ȡmapper
		EmpService empService = (EmpService) ac.getBean("empService");
		//3.���÷���
		List<Employee> list = empService.findAll();
		for(Employee i:list) {
			System.out.println(i);
		}
	}
}

