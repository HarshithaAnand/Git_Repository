package com.samplepackage;
import java.util.Scanner;
public class Calculator {
		public  int add(int num1, int num2) {
					int result= num1+num2;
			        System.out.println("Sum of two numbers:" +result);
			        return(result);
			    }
			    public int subtract(int num1, int num2) {
			    	int result= num1 - num2;
			        System.out.println("Subtraction of two numbers:" +result);
			        return(result);
			    }
			    public int multiply(int num1, int num2) {
			      int result= num1 * num2;
			      System.out.println("Multiplication of two numbers:" +result); 
			      return(result);
			    }
			    public int  division(int num1, int num2) {
			        if (num2 == 0) {
			            System.out.println("Cannot divide by zero!"); 
			        }
			        else {
			        int result =  num1 / num2;
			        System.out.println("Division of two numbers:" +result);
			        return(result);
			        }
					return 0; 
			 public int  function1(int num1, int num2) {
			        if (num2 == 0) {
			            System.out.println("Cannot divide by zero!"); 
			        }
			        else {
			        int result =  num1 / num2;
			        System.out.println("Division of two numbers:" +result);
			        return(result);
			        }
					return 0; 
					public int  function2(int num1, int num2) {
				        if (num2 == 0) {
				            System.out.println("Cannot divide by zero!"); 
				        }
				        else {
				        int result =  num1 / num2;
				        System.out.println("Division of two numbers:" +result);
				        return(result);
				        }
						return 0; 
    
    
			    }
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter two numbers: ");
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			Calculator cal= new Calculator();
			cal.add(num1, num2);
			cal.subtract(num1, num2);
			cal.multiply(num1, num2);
			cal.division(num1, num2);
cal.add(num1, num2);
			cal.subtract(num1, num2);
			cal.multiply(num1, num2);
			cal.division(num1, num2);
		}		}}
