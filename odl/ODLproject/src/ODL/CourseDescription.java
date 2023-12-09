package ODL;

import java.util.Scanner;
import java.util.*;

public class CourseDescription {
	Scanner sc=new Scanner(System.in);


	public void CourseDescription1() {
		// TODO Auto-generated method stub
		System.out.println("Select a Couse to Show Description");
		System.out.println("-----------------------");
		System.out.println("Enter 1 for Python Quiz");
		System.out.println("Enter 2 for JavaScript Quiz");
		System.out.println("Enter 3 for java Quiz");
		System.out.println("Enter 4 for CSS,BootStrap Quiz");
		
		int select=sc.nextInt();
		 switch(select) {
		  case 1:
		select=1;
		if(select==1) {
			System.out.println("Readability: Python emphasizes clean and readable code, enhancing developer productivity.");
			System.out.println("Versatility: A general-purpose language, Python is suitable for diverse applications, from web development to data science.");
			System.out.println("Extensive Libraries: Python's rich standard library and third-party packages provide powerful tools for various tasks.");
			System.out.println("Community Support: With an active and large community, Python benefits from continuous development and a wealth of resources.");
			System.out.println("Interpreted and Interactive: Python's interpreted nature allows for quick development and an interactive mode for testing code line by line.");
		    break;
	    }
	  case 2:
	    if(select==2) {
		    System.out.println("JavaScript is a widely-used scripting language for enhancing interactivity and responsiveness in web browsers.");
		    System.out.println("Primarily employed for client-side development, JavaScript enables dynamic web content and user interactions.");
		    System.out.println("JavaScript uses an asynchronous model, allowing non-blocking code execution for efficient handling of concurrent operations.");
		    System.out.println("Adhering to the ECMAScript standard ensures consistent behavior across various web browsers, promoting compatibility.");
		    System.out.println("JavaScript extends its utility to server-side development with platforms like Node.js, offering a full-stack development capability.");
		    break;
	    }
	  case 3:
	    if(select==3) {
		    System.out.println("Platform-Independent: Java is platform-independent, enabling the development of applications that can run on any device with the Java Virtual Machine (JVM).");
		    System.out.println("Object-Oriented: Java follows an object-oriented programming paradigm, promoting code organization and reusability through classes and objects.");
		    System.out.println("Robust and Secure: Known for its strong memory management and built-in security features, Java provides a robust environment for developing secure applications.");
		    System.out.println("Multi-threading Support: Java supports multi-threading, allowing concurrent execution of tasks, which is crucial for efficient and responsive applications.");
		    System.out.println("Large Ecosystem: Java has a vast ecosystem with extensive libraries and frameworks, making it a popular choice for enterprise-level development and diverse applications.");
		    break;
	    }
	  case 4:
		  if(select==4) {
			  System.out.println("Bootstrap is a popular open-source front-end framework that simplifies web development by providing pre-designed components and styles.");
			  System.out.println("Bootstrap ensures mobile-first design with a responsive grid system, allowing websites to adapt seamlessly to different screen sizes.");
			  System.out.println("Bootstrap offers a collection of CSS and JavaScript components, including navigation bars, modals, and carousels, streamlining the creation of modern, feature-rich interfaces");
			  System.out.println("With consistent styling and behavior across major browsers, Bootstrap ensures a uniform user experience, saving developers from dealing with browser-specific quirks.");
			  System.out.println("Developers can easily customize Bootstrap's appearance and behavior, and there are options for theming, allowing the creation of unique designs while maintaining a solid foundation.");
		  }
		
	}

}
}