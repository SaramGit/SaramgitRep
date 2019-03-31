package com.nt.test;

import java.sql.SQLException;

import com.nt.dao.EmployeeDAO;

public class JdbcTest {

	public static void main(String[] args) {
		EmployeeDAO dao=null;
		int count=0;
		//create the employee dao class object
		dao=new EmployeeDAO();
		try {
			count=dao.getEmpCount();
			System.out.println("Employee Count is: "+count);
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class