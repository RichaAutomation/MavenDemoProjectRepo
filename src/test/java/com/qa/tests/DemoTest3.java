package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	@Test	
	public void sum()
	{
		
		System.out.println("DemoTest2:Sum Method");
		int a =10;
		int b= 20;		
		Assert.assertEquals(30, a+b,"Sum is not correct");
	}
	
	
	@Test	
	public void sub()
	{
		
		System.out.println("DemoTest2:sub Method");
		int a =10;
		int b= 20;		
		Assert.assertEquals(10, b-a,"sub is not correct");
	}
	
	
	@Test	
	public void div()
	{
		
		System.out.println("DemoTest2:div Method");
		int a =10;
		int b= 20;		
		Assert.assertEquals(2, b/a,"div is not correct");
	}
	
	@Test	
	public void mult()
	{
		
		System.out.println("DemoTest2:mult Method");
		int a =10;
		int b= 20;		
		Assert.assertEquals(200, a*b,"mult is not correct");
	}
}
