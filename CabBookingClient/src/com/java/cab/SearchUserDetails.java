package com.java.cab;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;
public class SearchUserDetails {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		int userId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id  ");
		userId = sc.nextInt();
		CabBookUserRemote service = null;
		    service = (CabBookUserRemote)
		    		new InitialContext().lookup("CabBookUser/remote");
		    UserDetails userdetails = service.searchUserDetails(userId);
		if (userdetails!=null) {
			System.out.println(userdetails);
		}

	}
}
