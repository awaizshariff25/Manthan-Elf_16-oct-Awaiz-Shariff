package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean authenticate(int empId, String password);
	
	public boolean delete(int empId);
	
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);

	public EmployeeInfoBean searchEmployee(int empId);
	
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	

}
