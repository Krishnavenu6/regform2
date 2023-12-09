package ODL;

import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Reg {
	String Name;
	String Emailid;
	String Password;
	
	
	Scanner sc = new Scanner(System.in);
	public void registers() throws Exception {
		
		
		System.out.println("Enter Name");
		Name=sc.next();
		
		System.out.println("Enter Emailid");
		Emailid=sc.next();
		
		System.out.println("Enter Password");
		Password=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection teja=null;
		
		String dbURL = "jdbc:mysql://localhost:3306/user";
		String username="root";
		String password="Teja@369";
		
		try {
			teja=DriverManager.getConnection(dbURL,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query1="insert into user1(Name,Emailid,Password) values(?,?,?)";
		
		 try(PreparedStatement preparedStatement=teja.prepareStatement(query1)) {
			
				preparedStatement.setString(1, Name);
				preparedStatement.setString(2, Emailid);
				preparedStatement.setString(3, Password);
				
				preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
			int useropt=1;
			
			while(useropt==1) {
				System.out.println("Registration Completed");
				System.out.println("-----------------***-----------------");
				System.out.println("Enter 1 to Login");
				System.out.println("Enter 2 to Exit");
				int select=sc.nextInt();
				
				
				if(select==1) {
					Log log =new Log();
					log.login();
				}
				else if(select==2) {
					System.out.println("thank you");
				}
				
		}
	}
	

}
