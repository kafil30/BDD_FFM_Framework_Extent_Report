  package com.ffm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//To create variable
	public static WebDriver driver;
	public static Properties prop;
	
	//The constructor,  to initialize the properties file, to connect with the config.properties file
	public TestBase() {
		try {
			prop = new Properties(); //To create an object, inputProperties are the variable, "C...." is the value
			FileInputStream inputProperties = new FileInputStream("C:\\Users\\Yellow\\eclipse-workspace\\com.ffm.bddFramework\\src\\"
					+ "main\\java\\com\\ffm\\config\\config.properties"); //FileInputStream is the object, came from import java.io.FileInputStream
			prop.load(inputProperties); //To load the properties file
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//The method, to initialize the driver, reuse  this method.
	//For every scenarios(For OT member, Create admin, login, logout) no need to make again again
	public static void initializeDriver() {
		
		//Local variable under the method
		String browserName = prop.getProperty("browser");//String type of variable
					
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();//To initialize the FirefoxDriver
				
		}else if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("baseURL"));
						
		}
}

