package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {
	
	@BeforeTest
	public void setup() {
		System.out.println("i will run before the test");
	}
	
	@Test(groups= {"smoke"})
	public void loginHomeLoan() {
		//code for web login 
		System.out.println("web login Home smoke");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		//code for mobile login
		System.out.println("mobile login Home");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		//code for api login
		System.out.println("api login Home");
	}
}