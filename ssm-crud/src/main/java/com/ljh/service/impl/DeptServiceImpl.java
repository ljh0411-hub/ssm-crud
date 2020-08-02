package com.ljh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljh.bean.Department;
import com.ljh.dao.DeptMapper;
import com.ljh.service.DeptService;

/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020年5月22日 上午9:16:51

 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {

	//注入dao层的mapper对象
	@Resource
	private DeptMapper deptMapper;
	
	@Override
	public void saveDept(Department department) {
		deptMapper.saveDept(department);
	}

}
