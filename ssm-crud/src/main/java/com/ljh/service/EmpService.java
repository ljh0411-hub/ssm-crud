package com.ljh.service;
/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020��5��22�� ����1:27:24

 */

import java.util.List;

import com.ljh.bean.Employee;

public interface EmpService {
	
	/**
	 * ��ѯ��������
	 */
	public List<Employee> findAll();
	
	/**
	 * ����id��ѯ����
	 */
	public Employee findById(Integer emp_id);
		
	/**
	 * ����idɾ������
	 */
	public void del(Integer emp_id);
	
	/**
	 * �������
	 */
	int insert(Employee employee);
	
	/**
	 * ��������
	 */
	int update(Employee employee);
}
