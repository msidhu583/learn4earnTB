package com.maven.learning.MAVEN_AUTOMATION_PROJECT;

public class Method_first {
	
	//Write a Java method to find the largest number among three numbers
	
	static boolean firstMethod(int a, int b, int c)
	{

	if (a>b && a>c)
	{
	System.out.println("a is largest");	
	return false;
	
	}
	else if (b>a && a<c)
	{
		System.out.println("b is largest");	
		return false;

	}
	else
	{
		System.out.println("c is largest");
		return true;
	}
	  }

	
	public static void main(String args[])
	{
		
		

		boolean value = firstMethod(69,65,94);
		if (value)
		{}
		else
		{}
		 
		
		
	}

}
