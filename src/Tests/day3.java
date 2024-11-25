package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class day3 {


	@BeforeClass
	public void runBeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void login(String urlname,String key) {
		System.out.println("Log in");
		System.out.println(urlname);
		System.out.println(key);
	}

	@AfterClass
	public void runAfterClass() {
		System.out.println("AfterClass");
	}

	@BeforeSuite
	public void runBeforeSuite() {
		System.out.println("RunThisBeforeSuite");
	}

	@AfterSuite
	public void runAfterSuite() {
		System.out.println("RunThisAfterSuite");
	}

	@BeforeMethod
	public void runBeforeEveryMethod() {
		System.out.println("BeforeEveryMethodFromThisClass");
	}

	@AfterMethod
	public void runAfterEveryMethod() {
		System.out.println("AfterEveryMethodFromThisClass");
	}

	@Test(groups = { "Smoke" })
	public void WebLoginCarLoan() {
		System.out.println("WebloginCar");
	}

	@Test(dataProvider="getdata")
	public void MobileLoginCarLoginLoan(String username, String password) {
		System.out.println("MobileLoginCarLoginLoan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(enabled = false)
	public void MobileLoginCarSignoutLoan() {
		System.out.println("MobileLoginCarSignoutLoan");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}

	@Test /*(dependsOnMethods = { "MobileLoginCarLoan" })*/
	public void LoginApiCarLoan() {
		System.out.println("LoginApiCarL");

	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination-username password
		//2nd username passoword-no credit history
		//3rd fraudulent credit history
		Object[][] data= new Object[3][2];//3 combinantion with 2 values  
		data[0][0]="firstusername";
		data[0][1]="password1";
		data[1][0]="secondusernam";
		data[1][1]="password2";
		data[2][0]="secondusernam";
		data[2][1]="password2";
		return data;
	}
}
