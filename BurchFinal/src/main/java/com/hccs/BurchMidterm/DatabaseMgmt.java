package com.hccs.BurchMidterm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseMgmt {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbuname="root";
	private String dbpassword="Unp0ssible";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member member) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result= "Data entered successfully";
		String sql="insert into member values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,  member.getFname());
			ps.setString(2,  member.getLname());
			ps.setString(3,  member.getUsername());
			ps.setString(4,  member.getPassword());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
		
	}

}
