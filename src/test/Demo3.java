package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	@BeforeClass
	public void classSetup() {
		System.out.println("BEfore class");
	}

	@AfterClass
	public void classSetupAfter() {
		System.out.println("After class");
	}

	@BeforeSuite
	public void suiteSetup() {
		System.out.println("i will be executed before all the test");
	}

	@AfterSuite
	public void suiteTeardown() {
		System.out.println("i will be executed after completion of all tests");
	}

	@BeforeMethod
	public void setupMethod() {
		System.out.println("before method loginCarLoan,loginAPICarLoan");
	}

	@AfterMethod
	public void setupMethodAfter() {
		System.out.println("after method loginCarLoan,loginAPICarLoan");
	}

	@Test()
	public void loginCarLoan() {
		// code for web login
		System.out.println("web login car");
	}

	@Test
	public void mobileLoginCarLoan() {
		// code for mobile login
		System.out.println("mobile login car");
	}

	@Test(dependsOnMethods = { "loginCarLoan" })
	public void loginAPICarLoan() {
		// code for api login
		System.out.println("api login car");
	}

	@Test
	public void mobileLoginOutLoan() {
		// code for mobile login
		System.out.println("mobile login car");
	}
}
