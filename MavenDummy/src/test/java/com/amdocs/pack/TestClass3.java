package com.amdocs.pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {

	@Test
public void sum()
{
		System.out.println("This is the sum method");
		int a =10;
		int b =20;
		int c =a+b;
		Assert.assertEquals(c, 30);
}

	@Test
	public void sub()
	{	System.out.println("I am the sub");		
		int a = 45;
		int b =30;
		int c = a-b;
		Assert.assertEquals(c, 15);
	}
	
	@Test
	public void mult()
	{	System.out.println("I am the multiplication");		
		int a = 10;
		int b =10;
		int c = a*b;
		Assert.assertEquals(c, 100);
	}
	
	
	@Test
	public void div()
	{	System.out.println("I am the division");		
		int a = 45;
		int b =5;
		int c = a/b;
		Assert.assertEquals(c, 9);
	}
	

}
