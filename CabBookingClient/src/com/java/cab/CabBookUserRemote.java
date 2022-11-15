package com.java.cab;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CabBookUserRemote {
	List<UserDetails> showUserDetails()throws ClassNotFoundException, SQLException;
	UserDetails searchUserDetails(int userId) throws ClassNotFoundException, SQLException;
	
}
