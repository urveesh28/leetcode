import java.util.*;
import java.io.*;

public class Calculator
{
	public static double addNumbers(double num1,double num2)
	{
		double sum=num1+num2;
		return sum;
	}
	
	public static double absoluteDifference(double num1,double num2)
	{
		double difference=Math.abs(num1-num2);
		return difference;
	}
	
	public static double multNumbers(double num1,double num2)
	{
		double product=num1*num2;
		return product;
	}
	
	public static double divisionNumbers(double num1,double num2)
	{
		double quotient=num1/num2;
		return quotient;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		
		System.out.println("Enter number 1 =");
		num1=sc.nextDouble();
		System.out.println("Enter number 2 =");
		num2=sc.nextDouble();
		
		int choice;
		
		System.out.println("1.for addition");
		System.out.println("2.for absolute difference");
		System.out.println("3.for multiplication");
		System.out.println("4.for division");
		System.out.println("Enter your choice :");
		choice =sc.nextInt();
		
		switch(choice)
		{
			case 1 : System.out.println("Sum = "+addNumbers(num1,num2));
						break;
			case 2 : System.out.println(" Absolute Difference = "+absoluteDifference(num1,num2));
						break;
			case 3 : System.out.println("Multiplication Result= "+multNumbers(num1,num2));
						break;
			case 4 : System.out.println("Division Result = "+divisionNumbers(num1,num2));
						break;
			default : System.out.println("Invalid Input");
		}
	}
}