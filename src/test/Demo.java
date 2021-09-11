package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@AfterTest
	public void tearDown() {
		System.out.println("i will execute at last");
	}

	@Test
	public void demoTest() {
		System.out.println("demo test");
	}
	
	@Test(groups= {"smoke"},enabled=false)
	public void demoTest2() {
		System.out.println("demo test 2 smoke");
	}
	
	@Parameters({"URL","USERNAME"})
	@Test(groups= {"smoke"})
	public void paramTest(String param,String username) {
		System.out.println("parameter test");
		System.out.println(param);
		System.out.println(username);
	}
	
	@DataProvider
	public Object getData() {
		Object[][] data = {{"username1","password1"},{"username2","password2"},{"username3","password3"}};
		return data;
	}
	
	@Test(groups= {"smoke"},dataProvider="getData")
	public void loginCheck(String uname, String pwd) {
		System.out.println(uname);
		System.out.println(pwd);
		Assert.assertTrue(false);
	}
}
