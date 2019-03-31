package com.nt.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

	   public static Connection getConnection(String url,String uname,String pwd) throws Exception {
		   return DriverManager.getConnection(url,uname,pwd);
	   }
}
