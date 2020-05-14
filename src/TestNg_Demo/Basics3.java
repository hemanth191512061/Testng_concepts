package TestNg_Demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basics3 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("it is before class");
	}
	@BeforeSuite
	public void Principle() {
		System.out.println("Principle");
	}

	@Test(groups = { "lead" })
	public void chairman() {
		System.out.println("Chairman");
	}

	@Test(dataProvider="dataset")
	public void Vicechairman(String user,String password) {
		//System.out.println("Chairman");
		System.out.println(user + password);

	}
	
	@DataProvider
	public Object dataset(){
		
		Object[][] data=new Object[3][2];
		data[0][0]= "nani";
		data[0][1]= "1234";
		data[1][0]= "hemanth";
		data[1][1]= "123";
		data[2][0]="reddy";
		data[2][1]= "321";
		return data;
		
		
		
		
	}
	
	
	
}
