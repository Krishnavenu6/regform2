package ODL;

import java.util.Scanner;
import java.util.*;

public class ODLmain {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter 1 for Registration");
		System.out.println("Enter 2  to  Login");
		System.out.println("Enter 3  to Exit");
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Reg reg=new Reg();
			reg.registers();
			break;
		
		case 2:
			Log log=new Log();
			log.login();
			break;
		case 3:
			System.out.println("Thank you Visit Again");
		
		}

	}

}
