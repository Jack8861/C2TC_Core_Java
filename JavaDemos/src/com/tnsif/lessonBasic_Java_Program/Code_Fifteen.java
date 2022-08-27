package com.tnsif.lessonBasic_Java_Program;

public class Code_Fifteen {

	public static void main(String[] args) {
		char x = 'F';
		switch (x) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
		}
		
		String name = "te";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
	}

}
