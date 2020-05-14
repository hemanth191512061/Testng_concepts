package TestNg_Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DefineGlobalValues {
	
	WebDriver driver;
	@Test
	public void globalvalue() throws IOException {
	Properties prop=new Properties();
     FileInputStream file=new FileInputStream("C:\\Users\\chinni\\eclipse-workspaceNew\\TestNg_Concepts\\globalValues.properties");
	prop.load(file);
	System.out.println(prop.getProperty("username"));
    if(prop.getProperty("browser").contains("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
    	
     driver=new ChromeDriver();
    }
    else if(prop.getProperty("browser").equals("firefox")) {
    	System.setProperty("webdriver.gecko.driver","C:\\eclipse\\geckodriver.exe");
    	driver=new FirefoxDriver();
    }
    else {
    	System.setProperty("webdriver.IEDriverServer.driver","C:\\selenium\\IEDriverServer.exe");
    	driver=new InternetExplorerDriver();
    }
    
    driver.get(prop.getProperty("url"));
    
	
}
}
