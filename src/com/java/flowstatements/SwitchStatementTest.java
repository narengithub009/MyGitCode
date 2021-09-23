package com.java.flowstatements;

public class SwitchStatementTest {

	public static void main(String[] args) {
		
		String marks ="marks >=80";
		
		switch (marks) {
		case "marks >=80":
			System.out.println("PASS --- A GRADE");
			break;
		case "marks>=60":
			System.out.println("PASS --- B GRADE");
			break;
		case "marks>40":
			System.out.println("PASSS");
			break;
		default:
			System.out.println("FAIL");
			break;
		}
	}
}
