package TestNg_Demo;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Basics2 extends DefineGlobalValues {
	@Test(groups= {"lead"})
	public void student1() throws Exception {
		globalvalue();
		System.out.println("yeswanth");
	}
	@AfterSuite
	public void student2() {
		System.out.println("Dakshitha");
	}
}
