package Execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Selinstance {

	
	
	static FirefoxDriver Driver = null ;
	
	public static FirefoxDriver getinstance()
	{
		
		
		if(Driver == null)
		{
			
			
			Driver = new FirefoxDriver();
			
					
		}
		
		return Driver;
		
		
	}
	
	
}
