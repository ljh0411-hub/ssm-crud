package com.ljh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ljh.bean.Employee;
import com.ljh.dao.EmpMapper;
import com.ljh.service.EmpService;

/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020年5月22日 下午1:28:43

 */
@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpMapper empMapper;
	
	@Override
	public List<Employee> findAll() {	
		return empMapper.findAll();
	}

	@Override
	public void del(Integer emp_id) {
		empMapper.del(emp_id);	
	}

	@Override
	public Employee findById(Integer emp_id) {
		return empMapper.findById(emp_id);
	}

	@Override
	public int insert(Employee employee) {
		empMapper.insert(employee);
		return 1;
	}

	@Override
	public int update(Employee employee) {
		empMapper.update(employee);
		return 1;
	}
	
	
	

}
