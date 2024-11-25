package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void lastTest() {
		System.out.println("lastTest");
	}

	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan() {
		System.out.println("WebLoginHomeLoan");
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}
	@Test
	public void LoginApiHomeLoan() {
		System.out.println("LoginApiHomeLoan");

	}
	@BeforeTest
	public void prerequsities() {
		System.out.println("first");
	}
}
