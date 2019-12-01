package com.basic.ipen;

public class JavaSwitch {

	public static void main(String[] args) {
		
		String color ="brown";
		
		switch(color){
		case "red":
			System.out.println("The color is red");
			break;
		case "yellow":System.out.println("The color is yellow");
		break;
		case "green": System.out.println("The color is green");
		break;
		default:
			System.out.println("wrong color");
			//break;
		}

	}

}
