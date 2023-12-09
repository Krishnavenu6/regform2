package ODL;

import java.util.Scanner;
import java.util.*;

public class InteractiveLearning {
	Scanner sc = new Scanner(System.in);
	
		public void PythonLearn() throws Exception{
        System.out.println("Enter 1 for course structure");
        System.out.println("Enter 2 for course certificate");
        System.out.println("Enter 3 for course videos");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("https://roadmap.sh/java");
                break;
            case 2:
                System.out.println("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vectorstock.com%2Froyalty-free-vector%2Fcertificate-template-printable-in-gold-and-black-vector-40502183&psig=AOvVaw3qPU5CFvqt1C-5oI1OUxaG&ust=1702105288718000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCJijkLui_4IDFQAAAAAdAAAAABAE");
                break;
            case 3:
                System.out.println("https://www.youtube.com/watch?v=VHbSopMyc4M&list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5");
                break;
            default:
                System.out.println("You Entered A Wrong Number");
                break;
        }
        
    }     
		public void JavaScriptLearn() {
	        System.out.println("Enter 1 for course structure");
	        System.out.println("Enter 2 for course certificate");
	        System.out.println("Enter 3 for course videos");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("js");
	                break;
	            case 2:
	                System.out.println("js linl");
	                break;
	            case 3:
	                System.out.println("js link");
	                break;
	            default:
	                System.out.println("You Entered A Wrong Number");
	                break;
	        }
	        sc.close();
	    }
		public void JavaLearn() {
	        System.out.println("Enter 1 for course structure");
	        System.out.println("Enter 2 for course certificate");
	        System.out.println("Enter 3 for course videos");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("j");
	                break;
	            case 2:
	                System.out.println("jlink");
	                break;
	            case 3:
	                System.out.println("j linl");
	                break;
	            default:
	                System.out.println("You Entered A Wrong Number");
	                break;
	        }
	        sc.close();
	    }
		public void BootStrapLearn() {
	        System.out.println("Enter 1 for course structure");
	        System.out.println("Enter 2 for course certificate");
	        System.out.println("Enter 3 for course videos");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("b");
	                break;
	            case 2:
	                System.out.println("jlink");
	                break;
	            case 3:
	                System.out.println("jlink");
	                break;
	            default:
	                System.out.println("You Entered A Wrong Number");
	                break;
	        }
	        sc.close();
	    }
  
}



