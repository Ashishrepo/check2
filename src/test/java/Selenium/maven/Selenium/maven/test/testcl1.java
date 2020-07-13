package Selenium.maven.Selenium.maven.test;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcl1 {

	@BeforeMethod
	public void bc() {
		System.out.println("Before class");
	}


	@Test
	public void t() {
		System.out.println("Inside Test");
	}



	@AfterMethod
	public void ac() {
		System.out.println("After Class");
	}
}
