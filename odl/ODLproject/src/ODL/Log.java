package ODL;

import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Log{
	String email;
	String  Password;
     
	Scanner sc=new Scanner(System.in);
	public void login() throws Exception {
		
		System.out.println("Enter your Emailid");
		email=sc.next();
		
		System.out.println("Enter your Password");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from user1";
		PreparedStatement view;
		
		
		try {
			int user=1;
			view=teja.prepareStatement(query);
			ResultSet rs=view.executeQuery(query);
			while(rs.next()) {
				if(email.equals(rs.getString("Emailid")) && password.equals(rs.getString("Password")));
				  int useropt=1;
				  user=2;
				  System.out.println("----------------------------------------");
				  System.out.println("You are Logged into Website");
				  System.out.println("----------------------------------------");
				  System.out.println("Enter 1 to Show Course Details");
				  System.out.println("Enter 2 to participate Quiz");
				  System.out.println("Enter 3 to See Description");
				  
				  int select=sc.nextInt();
				  CourseDetails cd= new CourseDetails();
				  switch(select) {
				  case 1:
					    cd.CourseDetails1();
					    break;
				    
				  case 2:
		
					    ParticipateQuiz pq=new ParticipateQuiz();
					    pq.ParticipateQuiz1();
					    break;
				    
				  case 3:
				   
					    cd.CourseDetails1();
					    break;
				    
				    }
				
			}
		
		if(user==1) {
				System.out.println("Wrong Email or Password ");
			}
		}
				  
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


