package Execution;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.apache.commons.io.FileUtils;

	public class sedemo {
		
		public static void main(String args[])
		{
			
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("http://wwww.facebook.com");
			
			
			driver.close();
		}

	}



