package com.java.cab;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class UserShow {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		CabBookUserRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (CabBookUserRemote)
		    		new InitialContext().lookup("CabBookUser/remote");

		    List<UserDetails> userdetailsList = service.showUserDetails();
		    for (UserDetails userdetails : userdetailsList) {
				System.out.println(userdetails);
			}
	}
}
