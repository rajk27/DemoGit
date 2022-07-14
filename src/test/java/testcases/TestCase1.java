package testcases;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test(priority=1)
	public void setup() {
		System.out.println("This is Setup Test...");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("This is Login Test...");
	}
	
	
}
