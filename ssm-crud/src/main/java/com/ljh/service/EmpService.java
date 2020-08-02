package com.ljh.service;
/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020年5月22日 下午1:27:24

 */

import java.util.List;

import com.ljh.bean.Employee;

public interface EmpService {
	
	/**
	 * 查询所有数据
	 */
	public List<Employee> findAll();
	
	/**
	 * 根据id查询数据
	 */
	public Employee findById(Integer emp_id);
		
	/**
	 * 根据id删除数据
	 */
	public void del(Integer emp_id);
	
	/**
	 * 添加数据
	 */
	int insert(Employee employee);
	
	/**
	 * 更新数据
	 */
	int update(Employee employee);
}
