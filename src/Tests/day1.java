package Tests;


import org.testng.annotations.Test;


public class day1 {

	@Test
	public void demo() {
		
		System.out.println("hello");
		
	}
	@Test(groups= {"Smoke"})
	public void demo2() {
		
		System.out.println("bye");
		
	}
}
