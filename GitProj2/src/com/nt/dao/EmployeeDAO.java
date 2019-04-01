package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nt.util.JdbcUtil;

public class EmployeeDAO {

	    public int getEmpCount() throws Exception {
	    	Connection con=null;
	    	PreparedStatement ps=null;
	    	ResultSet rs=null;
	    	int count=0;
	    	//get connetion
	    	con=JdbcUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
	        //create the prepared statement object
	    	ps=con.prepareStatement("SELECT COUNT(*) FROM EMP");
	    	//execute the query
	    	rs=ps.executeQuery();
	    	//process the resultset
	    	rs.next();
	    	count=rs.getInt(1);
	    	return count;	
	    }
	    public int getMaxSal() throws Exception{
	    	Connection con=null;
	    	PreparedStatement ps=null;
	    	ResultSet rs=null;
	    	int salary=0;
	    	//get connetion
	    	con=JdbcUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
	        //create the prepared statement object
	    	ps=con.prepareStatement("SELECT Max(Sal) FROM EMP");
	    	//execute the query
	    	rs=ps.executeQuery();
	    	//process the result
	    	rs.next();
	    	salary=rs.getInt(1);
	    	return salary;
	    }
}
