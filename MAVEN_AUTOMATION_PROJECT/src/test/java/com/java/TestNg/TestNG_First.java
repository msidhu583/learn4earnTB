package com.java.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_First {

	//because of certain annotatios
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Tis is Before Suite Annotation");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is Before Tst ");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is Befre class ");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is Befre Method ");
	}
	@Test
	public void RegistrationTest()
	{
		System.out.println("This is  Tst ");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is After Method ");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("This is After Class");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is Afer Suite");
	}
	@AfterTest
	public void AterTest() {
		System.out.println("This i After Test");
	}
	
}
