package com.nt.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

	public static  Connection getConnection(String url,String user,String pwd)throws Exception{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","12345");
	}
}
