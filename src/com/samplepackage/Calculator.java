package com.samplepackage;
import java.util.Scanner;
public class Calculator {
		public  int sum(int num1, int num2) {
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
			    public int  divide(int num1, int num2) {
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
			cal.sum(num1, num2);
			cal.subtract(num1, num2);
			cal.multiply(num1, num2);
			cal.divide(num1, num2);
		}		}}
