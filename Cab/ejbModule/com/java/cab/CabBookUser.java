package com.java.cab;

import java.sql.SQLException;


import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CabBookUser
 */
@Stateless
@Remote(CabBookUserRemote.class)
public class CabBookUser implements CabBookUserRemote {
		 static UserDetailsDAO udao;
		 static {
			 udao = new UserDetailsDAO();
		 }
    /**
     * Default constructor. 
     */
    public CabBookUser() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public UserDetails searchUserDetails(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return udao.searchUserDetails(userId);
	}

	@Override
	public List<UserDetails> showUserDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return udao.showUserDetails();	}
}

	

	
