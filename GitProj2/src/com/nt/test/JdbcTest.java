package com.nt.test;

import java.sql.SQLException;
import java.util.Date;

import com.nt.dao.EmployeeDAO;
import com.nt.service.EmployeeMgmtService;

public class JdbcTest {

	public static void main(String[] args) {
		EmployeeDAO dao=null;
		EmployeeMgmtService service=null;
		int count=0;
		int salary=0;
		//create the employee dao class object
		dao=new EmployeeDAO();
		//create the employee service class object
		service=new EmployeeMgmtService();
		try {
			//count=dao.getEmpCount();
			//System.out.println("Employee Count is: "+count);
			salary=dao.getMaxSal();
			System.out.println("Employee Maxsalary is: "+salary);
			//service class count
			count=service.getEmpCount();
			System.out.println("Employee Count is: "+count);
			System.out.println(new Date());
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
