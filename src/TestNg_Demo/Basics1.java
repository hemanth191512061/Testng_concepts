package TestNg_Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics1 {

	@AfterTest
	public void aftertest() {
		System.out.println("it is after test in folder");
	}
	@Test(dependsOnMethods= {"staff"})
	public void Teacher1() {
		System.out.println("RamaLakshmi the great teacher");
	}
	@Test(groups= {"lead"})
	public void Teacher2() {
		System.out.println("chinni the cellphone viewers");
	}
	@Parameters({"website","key"})
	@Test
	public void staff(String website, String keys) {
		System.out.println("bujji");
		System.out.println(website);
		System.out.println(keys);
	}
	@BeforeTest
	public void aftermethod() {
		System.out.println("it is Before method in folder");
	}
	@Test(enabled=false)
	public void owner() {
		System.out.println("hemanth");
	}
}
