package com.java.cab;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDetailsDAO {

	Connection connection;
	PreparedStatement pst;
	
	public UserDetails searchUserDetails(int userId)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from userdetails where userId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, userId);
		ResultSet rs = pst.executeQuery();
		UserDetails userdetails = null;
		if(rs.next()) {
			userdetails = new UserDetails();
			userdetails.setUserId(rs.getInt("userId"));
			userdetails.setUserName(rs.getString("userName"));
			userdetails.setPassCode(rs.getString("passCode"));
			userdetails.setFirstName(rs.getString("firstName"));
			userdetails.setLastName(rs.getString("lastName"));
			userdetails.setCity(rs.getString("city"));
			userdetails.setState(rs.getString("state"));
			userdetails.setMobile(rs.getString("mobile"));
			userdetails.setEmail(rs.getString("email"));

		}
		return userdetails;
	}
	
	public List<UserDetails> showUserDetails() throws 
	ClassNotFoundException, SQLException {
List<UserDetails> userdetailsList = new ArrayList<UserDetails>();
connection = ConnectionHelper.getConnection();
String cmd = "select * from userdetails";
pst = connection.prepareStatement(cmd);
ResultSet rs = pst.executeQuery();
UserDetails userdetails = null;
while(rs.next()) {
	userdetails = new UserDetails();
	userdetails.setUserId(rs.getInt("userId"));
	userdetails.setUserName(rs.getString("userName"));
	userdetails.setPassCode(rs.getString("passCode"));
	userdetails.setFirstName(rs.getString("firstName"));
	userdetails.setLastName(rs.getString("lastName"));
	userdetails.setCity(rs.getString("city"));
	userdetails.setState(rs.getString("state"));
	userdetails.setMobile(rs.getString("mobile"));
	userdetails.setEmail(rs.getString("email"));
	userdetailsList.add(userdetails);
}
return userdetailsList;
}
}
