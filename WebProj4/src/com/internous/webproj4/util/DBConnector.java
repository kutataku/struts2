package com.internous.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	private static String drivername="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/testdb";
	private static String user = "root";
	private static String password="";

	public Connection getConnection() { Connection con = null;
	try{
	Class.forName(drivername);
	con = DriverManager.getConnection(url,user,password); } catch (ClassNotFoundException e) { e.printStackTrace() ;
	} catch (SQLException e) {
	e.printStackTrace() ;
	}
	return con ;
	}
	}


