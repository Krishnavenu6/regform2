package ODL;

import java.util.Scanner;
import java.util.*;

public class ParticipateQuiz {
	Scanner sc=new Scanner(System.in);

	public void ParticipateQuiz1() {
		// TODO Auto-generated method stub
		System.out.println("Select a Couse for Quiz");
		System.out.println("-----------------------");
		System.out.println("Enter 1 for Python Quiz");
		System.out.println("Enter 2 for JavaScript Quiz");
		System.out.println("Enter 3 for java Quiz");
		System.out.println("Enter 4 for CSS,BootStrap Quiz");
		
		int select=sc.nextInt();
		select=1;
		int Count=0;
		if(select==1) {
		    System.out.println("python created in the year ?");
			System.out.println("options: 1)1985 2)1980 3)1972 4)2002");
			int op=sc.nextInt();
			if(op==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("python is Created by ?");
			System.out.println("options: 1)vick Harington 2)Sai ganesh 3)Guido van Rossum 4)Brendan Eich");
			int op1=sc.nextInt();
			if(op1==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which type of Programming does Python support?");
			System.out.println("options: 1)object-oriented programming 2)structured programming 3)functional programming 4)all of the mentioned");
			int op2=sc.nextInt();
			if(op2==4) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Is Python case sensitive when dealing with identifiers?");
			System.out.println("options: 1)no 2)yes 3)machine dependent 4)none of the mentioned");
			int op3=sc.nextInt();
			if(op3==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which of the following is the correct extension of the Python file?");
			System.out.println("options: 1).python 2).pi 3).py 4).p");
			int op4=sc.nextInt();
			if(op4==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}	
			System.out.println(Count);
      	}
		else if(select==2) {
			System.out.println("Inside which HTML element do we put the JavaScript?");
			System.out.println("options: 1)<js> 2)<javascript> 3)<script> 4)<scripting>");
			int op=sc.nextInt();
			if(op==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("JavaScript File Has An Extension of: ?");
			System.out.println("options: 1).Java 2).Js 3).javascript 4).xml");
			int op1=sc.nextInt();
			if(op1==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("The Tag is used To Give Heading To The Table?");
			System.out.println("options: 1)Head 2)Td 3)Th 4)Caption");
			int op2=sc.nextInt();
			if(op2==4) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Function is Used To Parse a String To Int ?");
			System.out.println("options: 1)Integer.Parse 2)Int.Parse 3)Parse.Int 4)none");
			int op3=sc.nextInt();
			if(op3==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Event is Used To Check An Empty Text Box?");
			System.out.println("options: 1)Onclick() 2)OnFocus() 3)OnBlur() 4)none");
			int op4=sc.nextInt();
			if(op4==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}	
			System.out.println(Count);
		}
		else if(select==3) {
			System.out.println("Who invented Java Programming?");
			System.out.println("options: 1)Guido van Rossum 2)James Gosling 3)Dennis Ritchie 4)Bjarne Stroustrup");
			int op=sc.nextInt();
			if(op==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println(" Which component is used to compile, debug and execute the java programs?");
			System.out.println("options: 1) JRE 2)JIT 3)JDK 4)JVM");
			int op1=sc.nextInt();
			if(op1==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which one of the following is not a Java feature?");
			System.out.println("options: 1)Object-oriented 2)Use of pointers 3)Portable 4)Dynamic and Extensible");
			int op2=sc.nextInt();
			if(op2==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which of these cannot be used for a variable name in Java?");
			System.out.println("options: 1)identifier & keyword 2)identifier 3)keyword 4)none");
			int op3=sc.nextInt();
			if(op3==3) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("What is the extension of java code files?");
			System.out.println("options: 1).js 2).txt 3).class 4).java");
			int op4=sc.nextInt();
			if(op4==4) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}	
			System.out.println(Count);
			
		}
		else if(select==4){
			System.out.println("Who developed the bootstrap?");
			System.out.println("options: 1)Guido van Rossum 2)James Gosling 3)Dennis Ritchie 4)Mark Otto and Jacob Thornton");
			int op=sc.nextInt();
			if(op==4) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Is Bootstrap3 mobile-first?");
			System.out.println("options: 1)True 2)False 3)Can't say 4)May be");
			int op1=sc.nextInt();
			if(op1==1) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("How many columns are allowed in a bootstrap grid system?");
			System.out.println("options: 1)2 2)12 3)3 4)all ");
			int op2=sc.nextInt();
			if(op2==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which of the following class in bootstrap is used to create a big box for calling extra attention?");
			System.out.println("options: 1).box 2).container 3).container-fluid 4).jumbotron");
			int op3=sc.nextInt();
			if(op3==4) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}
			System.out.println("Which of the following class is used to create a black navigation bar?");
			System.out.println("options: 1).navbar-default 2).navbar-inverse 3).navbar-black 4).navbar-dark");
			int op4=sc.nextInt();
			if(op4==2) {
				System.out.println("Answer is Correct");
				Count=Count+1;
			}
			else {
				System.out.println("Answer is Wrong");
			}	
			System.out.println(Count);
		}
			
			System.out.println("Enter 1 to See Progress Tracking");
			System.out.println("Enter 2 to Exit ");
			
			int input=sc.nextInt();
			
			if(input==1) {
				if(Count==0) {
					System.out.println("your Performance is Zero");
				}
				else if(Count==1) {
					System.out.println("your Performance is Poor");
				}
				else if(Count==2) {
					System.out.println("your Performance is Below Average");
				}
				else if(Count==3) {
					System.out.println("your Performance is Average");
				}
				else if(Count==4) {
					System.out.println("Your Performance is Good");
				}
				else if(Count==5) {
					System.out.println("your Performance is Excellent");
				}
				}
	
		else if(input==2) {
			System.out.println("your Quiz is Done");
		}

}
	
}

