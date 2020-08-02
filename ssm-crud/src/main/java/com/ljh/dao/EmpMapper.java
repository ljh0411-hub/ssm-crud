package com.ljh.dao;
/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020年5月22日 下午1:19:49

 */

import java.util.List;

import com.ljh.bean.Employee;

public interface EmpMapper {
	
	public List<Employee> findAll();
	
	public Employee findById(Integer emp_id);
	
	int del(Integer emp_id);
	
	int insert(Employee employee);
	
	int update(Employee employee);
	
}
