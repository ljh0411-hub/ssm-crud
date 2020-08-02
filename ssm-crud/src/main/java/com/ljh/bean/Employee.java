package com.ljh.bean;

import java.util.List;

public class Employee {
    private Integer emp_id;

    private String emp_name;

    private String gender;

    private String email;

    private Integer d_id;
    
    private Department department;
    
    public Employee() {
		super();
	}

	public Employee(Integer emp_id, String emp_name, String gender, String email, Integer d_id) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.gender = gender;
		this.email = email;
		this.d_id = d_id;
	}
	
	public Employee(String emp_name, String gender, String email, Integer d_id) {
		super();
		this.emp_name = emp_name;
		this.gender = gender;
		this.email = email;
		this.d_id = d_id;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", gender=" + gender + ", email=" + email
				+ ", d_id=" + d_id + ", department=" + department + "]";
	}

	
    
    

}