package com.nt.service;

import com.nt.dao.EmployeeDAO;

public class EmployeeMgmtService {

	public int getEmpCount() throws Exception{
		EmployeeDAO dao=null;
		int count=0;
		//use DAO
		dao=new EmployeeDAO();
		count=dao.getEmpCount();
		return count+10;
	}
}
