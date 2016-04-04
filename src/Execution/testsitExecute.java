package Execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;

public class testsitExecute {

	// FirefoxDriver driver;

	WebDriver driver;
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\ranantatmula\\Downloads\\chromedriver_win32\\chromedriver.exe");

	Results t = new Results();

	Date d = new Date();

	WebDriverWait wait;

	SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

	String foldername = dateFormat.format(d);

	File f1 = new File("C:/Users/ranantatmula/Desktop/" + foldername);

	String destination = "C:/Users/ranantatmula/Desktop/" + foldername;

	public void setup(String url) {

		try {

			// driver = new FirefoxDriver();

			System.out.println("IS it comimg here");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ranantatmula\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(url);

			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

			driver.manage().window().maximize();

		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void runtcase(String URL, String tcase) {

		System.out.println("URL is" + " " + URL);
		System.out.println("tcase is" + " " + tcase);

		setup(URL);

		if (URL.equalsIgnoreCase("http://se-sit.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			String tcaseselected = "Login";

			BalletBingoLogin();

		}

		if (URL.equalsIgnoreCase("http://se-sit.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			String tcaseselected = "Registration gd";

			BalletBingoRegistration();

		}
		
		
		if (URL.equalsIgnoreCase("http://se-sit.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			String tcaseselected = "EditAccount";

			BalletBingoEditAccount();

		}
		
		if (URL.equalsIgnoreCase("http://se-sit.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			String tcaseselected = "SetLimits";

			BalletBingoSetLimits();

		}
		
		

		if (URL.equalsIgnoreCase("http://www-sit.bidbingo.co.uk/content/bidbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			String tcaseselected = "Registration";

			BidBingoRegistration();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.bidbingo.co.uk/content/bidbingo/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			String tcaseselected = "EditAccount";

			BidBingoEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.bidbingo.co.uk/content/bidbingo/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			String tcaseselected = "SetLimits";

			BidBingoSetLimits();

		}
		

		if (URL.equalsIgnoreCase("http://www-sit.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			ButlinsBingoLogin();

		}

		if (URL.equalsIgnoreCase("http://www-sit.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			ButlinsBingoRegistration();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			ButlinsBingoEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			ButlinsBingoSetLimits();

		}
		

		if (URL.equalsIgnoreCase("http://www-sit.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CaliberBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CaliberBingoLogin();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			CaliberBingoEditAccount();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			CaliberBingoSetLimits();

		}
		

		if (URL.equalsIgnoreCase("http://online-sit.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CarltonBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://online-sit.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CarltonBingoLogin();

		}
		
		if (URL.equalsIgnoreCase("http://online-sit.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			CarltonBingoEditAccount();

		}
		
		if (URL.equalsIgnoreCase("http://online-sit.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			CarltonBingoSetLimits();

		}

		if (URL.equalsIgnoreCase("http://play-sit.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CastleBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://play-sit.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CastleBingoLogin();

		}
		
		
		if (URL.equalsIgnoreCase("http://play-sit.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			CastleBingoEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://play-sit.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			CastleBingoSetLimits();

		}

		if (URL.equalsIgnoreCase("http://www-sit.chitchatbingo.co.uk/content/chitchat/en/home.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			ChitChatBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.chitchatbingo.co.uk/content/chitchat/en/home.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			ChitChatBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.chitchatbingo.co.uk/content/chitchat/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			ChitChatBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.chitchatbingo.co.uk/content/chitchat/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			ChitChatBingoLogin();

		}

		if (URL.equalsIgnoreCase("http://www-sit.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			Club300Registration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			Club3000Login();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			Club3000EditAccount();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			Club3000SetLimits();

		}
		
		
		
		

		if (URL.equalsIgnoreCase("http://www-sit.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			DailyExpressRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			DailyExpressLogin();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			DailyExpressEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			DailyExpressSetLimits();

		}

		if (URL.equalsIgnoreCase("http://www-sit.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			DailyStarRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			DailyStarLogin();

		}

		
		if (URL.equalsIgnoreCase("http://www-sit.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			DailyStarEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			DailyStarSetLimits();

		}
		
		
		
		
		if (URL.equalsIgnoreCase("http://www-sit.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			HappyBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			HappyBingoLogin();

		}

		
		if (URL.equalsIgnoreCase("http://www-sit.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			HappyBingoEditAccount();

		}
		
		if (URL.equalsIgnoreCase("http://www-sit.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			HappyBingoSetLimits();

		}
		
		
		
		if (URL.equalsIgnoreCase("http://www-sit.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			LyckoBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			LyckoBingoLogin();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			LyckoBingoEditAccount();

		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			LyckoBingoSetLimits();

		}
		
		

		if (URL.equalsIgnoreCase("http://www-sit.bingozino.se/content/bingozinose/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			RoyalSEKRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.bingozino.se/content/bingozinose/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			RoyalSEKLogin();
		}

		if (URL.equalsIgnoreCase("http://www-sit.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			RoyalGamesRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			RoyalGamesLogin();
		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			RoyalGamesEditAccount();
		}
		

		if (URL.equalsIgnoreCase("http://www-sit.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			RoyalGamesSetLimits();
		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			OkBingoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			OkBingoLogin();
		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			OkBingoEditAccount();
		}
		
		if (URL.equalsIgnoreCase("http://www-sit.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			OkBingoSetLimits();
		}
		
		

		/*if (URL.equalsIgnoreCase("https://www.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			OkBingoRegistration();

		}*/

		

		if (URL.equalsIgnoreCase("http://www-sit.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			SlotNGamesRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			SlotNGamesLogin();
		}
		
		
		if (URL.equalsIgnoreCase("http://www-sit.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			SlotNGamesEditAccount();
		}
		
		if (URL.equalsIgnoreCase("http://www-sit.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			SlotNGamesSetLimits();
		}
		
		
		

		if (URL.equalsIgnoreCase("http://www-sit.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			SpelHallenRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			SpelHallenLogin();
		}
		
		if (URL.equalsIgnoreCase("http://www-sit.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("EditAccount"))) {

			SpelHallenEditAccount();
		}
		
		if (URL.equalsIgnoreCase("http://www-sit.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("SetLimits"))) {

			SpelHallenSetLimits();
		}


		

		if (URL.equalsIgnoreCase("http://www-sit.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			VIPCasinoRegistration();

		}

		if (URL.equalsIgnoreCase("http://www-sit.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			VIpCasinoLogin();
		}

		if (URL.equalsIgnoreCase("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			OLGRegistration();
		}

		if (URL.equalsIgnoreCase("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			OLGLogin();
		}

		if (URL.equalsIgnoreCase("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html")
				&& (tcase.equalsIgnoreCase("Deposit"))) {

			OLGDeposit();
		}
		
		if (URL.equalsIgnoreCase("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html")
				&& (tcase.equalsIgnoreCase("View Player History"))) {

			OLGViewHistory();
		}
		
		if (URL.equalsIgnoreCase("https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html")
				&& (tcase.equalsIgnoreCase("Set Limits"))) {

			OLGEditLimits();
		}
		
		
	}

	private void SpelHallenSetLimits() {
		
		
try
{
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bspel1");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
		Thread.sleep(1000);
		
		
		WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
		
		System.out.println(deplimits.isDisplayed());
		
		deplimits.click();
	
		Thread.sleep(3000);				
		WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
		
		System.out.println(deplimit.isDisplayed());
		
Select select = new Select(deplimit);
		
		select.selectByIndex(2);
		
		
		
		driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
		
		
		
		WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
		System.out.println(sucess.isDisplayed());
		
		t.insert("SetLimits","pass","SpelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
		capturescreenshot("SpelHallenSetLimits");
		
}


catch(Exception e)
{
	
	e.printStackTrace();
	
	t.insert("SetLimits","fail","SpelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
	capturescreenshot("SpelHallenSetLimits");
	
	
}
	}

	private void SpelHallenEditAccount() {
		try
		{
			
			
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bspel1");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
								driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
								WebDriverWait wait = new WebDriverWait(driver, 5);
								
								driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
								Thread.sleep(2000);
								
								

	driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
			Thread.sleep(1000);
											
											
	driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();

		Thread.sleep(1000);
											
	driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
											
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
											
											
	WebElement updatemessage = driver.findElement(By.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
											
							System.out.println(updatemessage.isDisplayed());
											Thread.sleep(2000);	
											
		t.insert("EditAccount", "pass","spelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
		capturescreenshot("SpelHallenBingoEditAccount");		

		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","spelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
			capturescreenshot("SpelHallenBingoEditAccount");	
			
		}
									
	}

	private void SpelHallenEditLimits() {
		
		
		
		
	}

	private void SlotNGamesSetLimits() {

		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_sngm01");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","SlotsNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
			capturescreenshot("SlotsNGamesBingoSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "fail","SlotsNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
		capturescreenshot("SlotsNGamesBingoSetLimits");
		
		}
	}

	private void BidBingoEditAccount1() {
		
       
		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_bid01");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("SetLimits", "pass","SlotsNGames","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
		capturescreenshot("BidBingoEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("SetLimits", "fail","SlotsNGames","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoEditAccount");
			
			
		}		
	}

	private void SlotNGamesEditAccount() {

		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_sngm01");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","SlotsNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
		capturescreenshot("SlotsNGamesEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","SlotsNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
			capturescreenshot("SlotsNGamesEditAccount");
			
			
		}		
	}

	private void OkBingoSetLimits() {
		try
		{
		WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		//System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("sit_okbingo56");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
				.sendKeys("password");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By
				.xpath("//a[@class='btn btn-logout']"));
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(logout));
		System.out.println(element.isDisplayed());	
		

		driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
						Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
	Thread.sleep(1000);
	
	
	WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
	
	System.out.println(deplimits.isDisplayed());
	
	deplimits.click();

	
	//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
	//Thread.sleep(5000);
	
	//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
	
	
	//System.out.println(Deplimits.isDisplayed());
	//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
	Thread.sleep(3000);				
	WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
	
	System.out.println(deplimit.isDisplayed());
	
Select select = new Select(deplimit);
	
	select.selectByIndex(2);
	
	
	
	driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
	
	Thread.sleep(2000);
	
	WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	
	WebElement success1 = driver.findElement(By.xpath("//div[@class='alert alert-success ng-binding']"));
	
	if(success1.isDisplayed())
	{
	
	t.insert("SetLimits", "pass","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
	capturescreenshot("OkBingoSetLimits");
	
	}
	
	else
	{

		t.insert("SetLimits", "pass","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
		capturescreenshot("OkBingoSetLimits");	
		
		
	}
	
	
		
		
	}
		
	catch(Exception e)
	{
		
		e.printStackTrace();
		
		t.insert("SetLimits", "fail","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
		capturescreenshot("OkBingoSetLimits");
		
	}		
	}

	private void OkBingoEditAccount() {
		try
		{
		WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		//System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("sit_okbingo56");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
				.sendKeys("password");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By
				.xpath("//a[@class='btn btn-logout']"));
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(logout));
		System.out.println(element.isDisplayed());		
		
		driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
		Thread.sleep(2000);


driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
Thread.sleep(2000);



driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
Thread.sleep(1000);


driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='first_name']")).clear();

driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");

driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
Thread.sleep(2000);

WebElement updatemessage = driver.findElement(By
.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
Thread.sleep(2000);

System.out.println(updatemessage.isDisplayed());
t.insert("EditAccount", "pass","OKBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
capturescreenshot("OKBingoEditAccount");
		
	}
		
	catch(Exception e)
	{
		
		e.printStackTrace();
		
		t.insert("EditAccount", "fail","OKBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
		capturescreenshot("OKBingoEditAccount");
		
	}
	}

	private void RoyalGamesSetLimits() {

		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_zino123");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
			capturescreenshot("RoyalGamesSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "fail","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
		capturescreenshot("RoyalGamesSetLimits");
		
		}		
	}

	private void RoyalGamesEditAccount() {

		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_zino123");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
		capturescreenshot("RoyalGamesEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
			capturescreenshot("RoyalGamesEditAccount");
			
			
		}		
	}

	private void LyckoBingoSetLimits() {

		try
		{
			
			Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_lyckosit123");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			
			
			t.insert("SetLimits", "pass","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
			capturescreenshot("LyckoBingoSetLimits");		
			
		}
		
		
		catch(Exception e)
		{
			t.insert("SetLimits", "fail","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
			capturescreenshot("LyckoBingoSetLimits");	
			
			
		}
	}

	private void LyckoBingoEditAccount() {
		
		try
		{
			


			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_lyckosit123");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
			
					driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
				
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
				
				//driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();

							driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
							Thread.sleep(1000);
							
							
							driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
							//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
							Thread.sleep(1000);
							
						driver.findElement(By.xpath("//input[@id='first_name']")).clear();

							driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
							
							driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
							
							
							WebElement updatemessage = driver.findElement(By
									.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
							
							System.out.println(updatemessage.isDisplayed());
							Thread.sleep(2000);	
							
							t.insert("EditAccount", "pass","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
							capturescreenshot("LyckoBingoEditAccount");			
			
			
			
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			t.insert("EditAccount", "fail","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
	
			
		}
		
	}

	private void HappyBingoSetLimits() {
		try
		{
		System.out.println("Happy Bingo EditAccount");
		WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("sit_happy56");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
				.sendKeys("password");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By
				.xpath("//a[@class='btn btn-logout']"));
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(logout));
		System.out.println(element.isDisplayed());
		
		
driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
		Thread.sleep(1000);
		

		
		
		WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
		
		System.out.println(deplimits.isDisplayed());
		
		deplimits.click();
	
		Thread.sleep(3000);				
		WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
		
		System.out.println(deplimit.isDisplayed());
		
Select select = new Select(deplimit);
		
		select.selectByIndex(2);
		
		
		
		driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
		
		Thread.sleep(2000);
		
		
		WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
		System.out.println(sucess.isDisplayed());
		
		t.insert("SetLimits","pass","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
		capturescreenshot("HappyBingoSetLimits");



		
		}
		
		catch(Exception e)
		{
			t.insert("SetLimits", "fail","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
			capturescreenshot("HappyBingoSetLimits");
					
			
			
		}
				
	}

	private void HappyBingoEditAccount() {
		
		try
		{
		System.out.println("Happy Bingo EditAccount");
		WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("sit_happy56");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
				.sendKeys("password");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By
				.xpath("//a[@class='btn btn-logout']"));
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(logout));
		System.out.println(element.isDisplayed());
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		Thread.sleep(2000);
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);


t.insert("EditAccount", "pass","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
capturescreenshot("HappyBingoEditAccount");
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("EditAccount", "fail","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
			capturescreenshot("HappyBingoEditAccount");
					
			
			
		}
		
		
		
	}

	private void DailyStarSetLimits() {

		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_star56");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
			capturescreenshot("BidBingoSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "fail","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
		capturescreenshot("BidBingoSetLimits");
		
		}		
	}

	private void DailyStarEditAccount() {
		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_star56");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
		capturescreenshot("DailyStarEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
			capturescreenshot("DailyStarEditAccount");
			
			
		}		
	}

	private void DailyExpressSetLimits() {
		
		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_daily7");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
			capturescreenshot("DailyExpressSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "pass","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
		capturescreenshot("DailyExpressSetLimits");
		
		}		
	}

	private void DailyExpressEditAccount() {
		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_daily7");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
		capturescreenshot("DailyExpressEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
			capturescreenshot("DailyExpressEditAccount");
			
			
		}		
	}

	private void Club3000SetLimits() {
		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_clb3k");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
			capturescreenshot("Club3000SetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "pass","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
		capturescreenshot("Club3000SetLimits");
		
		}		
	}

	private void Club3000EditAccount() {
		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_clb3k");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
		capturescreenshot("Club3000EditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
			capturescreenshot("Club3000EditAccount");
			
			
		}		
	}

	private void Club3000EditLimits() {
		// TODO Auto-generated method stub
		
	}

	private void CastleBingoSetLimits() {
		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_kishore123");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "pass","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
		capturescreenshot("CastleBingoSetLimits");
		
		}
	}		
	

	private void CastleBingoEditAccount() {

		try
		{
			


			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_kishore123");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				
				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='first_name']")).clear();

			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
			
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
			
			
			WebElement updatemessage = driver.findElement(By
					.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
			
			System.out.println(updatemessage.isDisplayed());
			Thread.sleep(2000);
			
			t.insert("EditAccount","pass","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoEditAccount");
						
			
			
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			t.insert("EditAccount","fail","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoEditAccount");

		}
		
	}
		
		
		
		
		
	

	private void CarltonBingoSetLimits() {
		try
		{
			
			WebElement button = driver.findElement(By
					.xpath("//div[@class='btn-panel custom']/a[1]"));

			System.out.println(button.isDisplayed());
			button.click();
			
			Thread.sleep(5000);
				
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
			.sendKeys("Sit_bcarl4");
	driver.findElement(
			By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
			.sendKeys("password");

	driver.findElement(
			By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
			.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
		
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
		
		System.out.println(deplimits.isDisplayed());
		
		deplimits.click();
	
		
		//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//Thread.sleep(5000);
		
		//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
		
		
		//System.out.println(Deplimits.isDisplayed());
		//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
		Thread.sleep(3000);				
		WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
		
		System.out.println(deplimit.isDisplayed());
		
Select select = new Select(deplimit);
		
		select.selectByIndex(2);
		
		
		
		driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
		
		Thread.sleep(3000);
		
		WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
		System.out.println(sucess.isDisplayed());
		t.insert("SetLimits", "pass","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
		capturescreenshot("CarltonBingoSetLimits");
		
		
	}
	
catch(Exception e)
	{
		
	e.printStackTrace();
	t.insert("SetLimits", "fail","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
	capturescreenshot("CarltonBingoSetLimits");
	
	}		
	}

	private void CarltonBingoEditAccount() {
		
		 
		try
		{
			

WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(5000);
			
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
		.sendKeys("Sit_bcarl4");
driver.findElement(
		By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
		.sendKeys("password");

driver.findElement(
		By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
		.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
		capturescreenshot("CarltonBingoEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
			capturescreenshot("CarltonBingoEditAccount");
			
			
		}
		
	}

	private void CaliberBingoSetLimits() {
		try
		{
			
			Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bcali1");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			
			t.insert("SetLimits","pass","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CaliberBingoSetLimits");
						
			
			
			
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			t.insert("SetLimits","fail","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CaliberBingoSetLimits");
			
			
		}		
	}

	private void CaliberBingoEditAccount() {
		
		
		try
		{
			
			System.out.println("Why its coming here");
		
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bcali1");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
		capturescreenshot("CaliberBingoEditAccont");
		
		
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			t.insert("EditAccount", "fail","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CaliberBingoEditAccont");
			
			
		}
		
		
	}

	private void ButlinsBingoSetLimits() {
		
		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_butlins10");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("ButlinsBingoSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "fail","Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
		capturescreenshot("ButlinsBingoSetLimits");
		
		}
		
	}

	private void ButlinsBingoEditAccount() {

		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_butlins10");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
		capturescreenshot("BidBingoEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("BidBingoEditAccount");
			
			
		}		
	}

	private void BidBingoSetLimits() {
		
		
		try
		{
			

			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_bid01");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
				

				driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
								Thread.sleep(2000);
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			
			//driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//Thread.sleep(5000);
			
			//WebElement Deplimits = driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]"));
			
			
			//System.out.println(Deplimits.isDisplayed());
			//driver.findElement(By.xpath("//a[contains(text(),'Bekräfta maxgräns')]")).click();
//
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			t.insert("SetLimits", "pass","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoSetLimits");
			
			
		}
		
	catch(Exception e)
		{
			
		e.printStackTrace();
		t.insert("SetLimits", "fail","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
		capturescreenshot("BidBingoSetLimits");
		
		}
	}

	private void BidBingoEditAccount() {
		
       
		try
		{
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_bid01");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
						
			
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			

			driver.findElement(By.xpath("//a[@class='btn btn-cta']")).click();
							Thread.sleep(2000);
		
		
			driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
			Thread.sleep(2000);
			

			
		driver.findElement(By.xpath("//a[@title='Edit your account details']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
		
		
		WebElement updatemessage = driver.findElement(By
				.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
		
		System.out.println(updatemessage.isDisplayed());
		Thread.sleep(2000);
		t.insert("EditAccount", "pass","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
		capturescreenshot("BidBingoEditAccount");
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("EditAccount", "fail","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoEditAccount");
			
			
		}
	}

	private void BalletBingoSetLimits() {
		
		try
		{
			
			Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_ballet66");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
			Thread.sleep(1000);
			
			
			WebElement deplimits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/ul/li[4]/a"));
			
			System.out.println(deplimits.isDisplayed());
			
			deplimits.click();
		
			Thread.sleep(3000);				
			WebElement deplimit= driver.findElement(By.xpath("//select[@id='dailydepositlimit']"));
			
			System.out.println(deplimit.isDisplayed());
			
Select select = new Select(deplimit);
			
			select.selectByIndex(2);
			
			
			
			driver.findElement(By.xpath("//div[@class='col-md-8']/a")).click();
			
			
			
			WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
			
			System.out.println(sucess.isDisplayed());
			
			t.insert("SetLimits","pass","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoSetLimits");
						
			
			
			
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			t.insert("SetLimits","fail","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoSetLimits");
			
			
		}
	}

	private void BalletBingoEditAccount() {
		
		
		try
		{
			


			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_ballet66");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
							
				
				driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 5);
			
			
				driver.findElement(By.xpath("//a[@class='btn btn-account']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("//a[@title='Ändra dina kontodetaljer']")).click();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//li[@class='ng-isolate-scope active']/a")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'Account details')]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='first_name']")).clear();

			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("xyz");
			
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/section/div/div/div/div/div[1]/div/form/div[2]/fieldset/div[5]/a")).click();
			
			
			WebElement updatemessage = driver.findElement(By
					.xpath("//div[@class='alert-message  ng-binding flash-notice']"));
			
			System.out.println(updatemessage.isDisplayed());
			Thread.sleep(2000);
			
			t.insert("EditAccount","pass","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoEditAccount");
						
			
			
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			t.insert("EditAccount","fail","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoEditAccount");

		}
		
	}

	private void OLGEditLimits() {
		
		try
		{
		
		driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
		.sendKeys("smokeptest001");
		
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
		.sendKeys("password7");
driver.findElement(By.xpath("//input[@id='olglogin1_eligible']"))
		.click();
driver.findElement(By.xpath("//input[@id='olglogin1_responsible']"))
		.click();
driver.findElement(By.xpath("//input[@class='btn floaterR']"))
		.click();
Thread.sleep(5000);	
driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
//Thread.sleep(10000);	
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='window']//ul")));
System.out.println(element.isDisplayed());
driver.findElement(By.xpath("//div[@class='lining']//a[contains(.,'Play Manager')]")).click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.xpath("//div[@class='row rowBtn floaterR']/a")).click();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='other']")).clear();

driver.findElement(By.xpath("//input[@id='other']")).sendKeys("1500");
driver.findElement(By.xpath("//input[@value='Save changes']")).click();
Thread.sleep(2000);
t.insert("SetLimits", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
capturescreenshot("SetLimits");

		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("SetLimits", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("SetLimits");
			
		}
		
	}

	private void OLGViewHistory() {
		
		try
		{
		
		driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
		.sendKeys("smokeptest001");
		
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
		.sendKeys("password7");
driver.findElement(By.xpath("//input[@id='olglogin1_eligible']"))
		.click();
driver.findElement(By.xpath("//input[@id='olglogin1_responsible']"))
		.click();
driver.findElement(By.xpath("//input[@class='btn floaterR']"))
		.click();
Thread.sleep(3000);	
driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
//Thread.sleep(10000);	

WebDriverWait wait = new WebDriverWait(driver, 10);

WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='window']//ul")));
System.out.println(element.isDisplayed());

driver.findElement(By.xpath("//div[@class='lining']//a[contains(.,'History')]")).click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//a[contains(. ,'Casino')]")).click();

driver.findElement(By.xpath("//li[@class='tab-item ']/a[contains(. ,'Casino')]")).click();
Thread.sleep(2000);
WebElement History =  driver.findElement(By.xpath("//div[@class='level1']"));

System.out.println("Casino History dispayed is");

System.out.println(History.isDisplayed());
t.insert("ViewHistory", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
capturescreenshot("ViewHistory");

		}
		
		
		catch(Exception e)
		{
			
			t.insert("ViewHistory", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("ViewHistory");
			
		}
	}

	private void OLGDeposit()  {
		
		try
		{
			System.out.println("This is for Deposit");
			driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
			.sendKeys("smokeptest001");
			
			driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
			.sendKeys("password7");
	driver.findElement(By.xpath("//input[@id='olglogin1_eligible']"))
			.click();
	driver.findElement(By.xpath("//input[@id='olglogin1_responsible']"))
			.click();
	driver.findElement(By.xpath("//input[@class='btn floaterR']"))
			.click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//li[@class='cashier item']")).click();
		
	WebDriverWait wait = new WebDriverWait(driver, 10);

	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='window']//ul")));
	System.out.println(element.isDisplayed());

	driver.findElement(By.xpath("//div[@class='lining']//a[contains(.,'Deposit')]")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='deposit_deposit']")).sendKeys("15");

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='submit']")).click();

	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	Thread.sleep(5000);

	WebElement form = driver.findElement(By.xpath("//form[@id='certapayCallback']"));


	System.out.println("Form displayed");
	System.out.println(form.isDisplayed());

	driver.findElement(By.xpath("//input[@value='Continue']")).click();

	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	Thread.sleep(5000);

	WebElement message = driver.findElement(By.xpath("//div[@class='depositSuccess']"));
	WebElement successmessage = wait.until(ExpectedConditions.visibilityOf(message));

	System.out.println("Success message is");
	System.out.println(successmessage.isDisplayed());

t.insert("Deposit", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
capturescreenshot("OLGDeposit");

		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("Deposit", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("OLGDeposit");
			
		}
		
	}

	private void OLGLogin() {

		try {
			
			System.out.println("THis is for Login");

			driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
					.sendKeys("smokeptest10");
			driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
					.sendKeys("Password7");
			driver.findElement(By.xpath("//input[@id='olglogin1_eligible']"))
					.click();
			driver.findElement(By.xpath("//input[@id='olglogin1_responsible']"))
					.click();
			driver.findElement(By.xpath("//input[@class='btn floaterR']"))
					.click();
			Thread.sleep(3000);

			t.insert("Login", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("OLGLogin");

		}

		catch (Exception e) {
			t.insert("Login", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("OLGLogin");

		}

	}

	private void OLGRegistration() {
		
		try
		{
			driver.findElement(By.xpath("//div[@class='validAttempt']//a[@class='btn floaterR']")).click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, 10);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='subWrap']")));
			System.out.println(element.isDisplayed());

			

			driver.findElement(By.xpath("//input[@id='olgregistration_0_firstname']"))
					.sendKeys("kkk");
			

			driver.findElement(By.xpath("//input[@id='olgregistration_0_lastname']"))
					.sendKeys("ravi");
			

			WebElement dropdownday=driver.findElement(By.id("olgregistration_0_dateofbirth_day"));

			
	  Select day = new Select(dropdownday);
	  
	  day.selectByIndex(2);

		WebElement dropdownmonth=driver.findElement(By.id("olgregistration_0_dateofbirth_month"));
		
	Select month = new Select(dropdownmonth);
	month.selectByIndex(2);

	WebElement dropdownyear = driver.findElement(By.id("olgregistration_0_dateofbirth_year"));

	Select year = new Select(dropdownyear);
	year.selectByIndex(2);

	int length = 5;
	int nicklength = 10;

	boolean useLetters = true;
	boolean useNumbers = false;


	String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

	String email = randomemail+"@gtech.com";

	String names = RandomStringUtils.random(length,useLetters,useNumbers);

	String username = "smokeptest"+names;

	String nickname = RandomStringUtils.random(nicklength,useLetters,useNumbers);

	System.out.println(email);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_street']")).sendKeys("501");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_city']")).sendKeys("hyderabad");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_postalcode_1']")).sendKeys("V3H");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_postalcode_2']")).sendKeys("1Z7");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_phone_area']")).sendKeys("232");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_phone_exchange']")).sendKeys("323");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_phone_number']")).sendKeys("4343");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_email2']")).sendKeys(email);

	driver.findElement(By.xpath("//input[@value='Next']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_password']")).sendKeys("password7");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_password2']")).sendKeys("password7");

	WebElement securityqn1 = driver.findElement(By.xpath("//select[@id='olgregistration_0_securityQOne']"));
	Select select = new Select(securityqn1);
	select.selectByIndex(2);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_securityanswer1']")).sendKeys("adasda");

	WebElement securityqn2 = driver.findElement(By.xpath("//select[@id='olgregistration_0_securityQTwo']"));
	Select select1 = new Select(securityqn2);
	select1.selectByIndex(2);
	driver.findElement(By.xpath("//input[@id='olgregistration_0_securityanswer2']")).sendKeys("adafdfsda");

	driver.findElement(By.xpath("//input[@id='olgregistration_0_nickname']")).sendKeys(nickname);


	driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge1']")).click();

	driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge2']")).click();

	driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge3']")).click();

	//driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge3']")).click();

	driver.findElement(By.xpath("//a[@class='linkTerms']")).click();

	Thread.sleep(10000);

	WebElement terms = driver.findElement(By.xpath("//div[@id='olgregistration_0_acceptTerms']/div[@class='lbContainer']"));

	//WebElement title = driver.findElement(By.xpath("//h1[@class='title']"));
	//WebElement termsandmessage = wait.until(ExpectedConditions.visibilityOf(terms));


	System.out.println(terms.isDisplayed());

	terms.isDisplayed();



	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)", "");

	driver.findElement(By.xpath("//input[@id='accept_checkbox']")).click();

	driver.findElement(By.xpath("//input[@id='agree_btn']")).click();


	Thread.sleep(3000);

	/*driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge1']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge2']")).click();
	Thread.sleep(3000);


	driver.findElement(By.xpath("//input[@id='olgregistration_0_acknowledge3']")).click();
	Thread.sleep(3000);*/

	driver.findElement(By.xpath("//input[@value='Submit']")).click();

	Thread.sleep(10000);

	WebDriverWait waits = new WebDriverWait(driver, 10);

	WebElement name = driver.findElement(By.xpath("//span[@class='name']")) ;

	waits.until(ExpectedConditions.visibilityOf(name));
t.insert("Registration", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
capturescreenshot("OLGRegistration");

		}
		
		
		catch(Exception e)
		{
			
			t.insert("Registration", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","CD52");
			capturescreenshot("OLGRegistration");	
			
		}

	}

	private void VIpCasinoLogin() {
		
		try
		{
			driver.findElement(
					By.xpath("//a[@class='button simple brown medium sign-in']"))
					.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys(
					"MrT_vip502");
			driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys(
					"password");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='login_submit']"))
					.click();

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//div[@class='centered']//a[@class='logout']")));	
			
			
		/*driver.findElement(By.xpath("//a[@class='button simple brown medium sign-in']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MrT_vip502");
		driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='centered']//a[@class='logout']")));*/
		t.insert("Login", "pass", "VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","SIT");
		capturescreenshot("VIPCasinoLogin");
		}
		
		catch(Exception e)
		{
			t.insert("Login", "fail", "VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","SIT");
			capturescreenshot("VIPCasinoLogin");	
			
			
		}

		
	}

	private void VIPCasinoRegistration() {
		try {
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);


driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.findElement(By.xpath("//a[@class='button simple brown medium sign-in']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("fdsfsdfsf");
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("fdsfsderr");
WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
Select days = new Select(day);
days.selectByIndex(2);

WebElement month = driver.findElement(By.xpath("//select[@id='day']"));
Select months = new Select(month);
months.selectByIndex(2);

WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select years = new Select(year);
years.selectByIndex(2);

WebElement gender = driver.findElement(By.xpath("//select[@id='year']"));
Select genders = new Select(gender);
genders.selectByIndex(1);
driver.findElement(By.xpath("//input[@id='mobilenumber']")).sendKeys("99080259671");
driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Alkapuri");
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Alkapuri123");
driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys("500072");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");

WebElement region = driver.findElement(By.xpath("//select[@id='region']"));
Select regions = new Select(region);
regions.selectByIndex(2);


WebElement nationality = driver.findElement(By.xpath("//select[@id='nationality']"));
Select nation = new Select(nationality);
nation.selectByIndex(2);


WebElement language = driver.findElement(By.xpath("//select[@id='language']"));
Select languages = new Select(language);
languages.selectByIndex(1);
driver.findElement(By.xpath("//button[@id='submit']")).click();
driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(Loginname);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("password");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
driver.findElement(By.xpath("//input[@id='nickname']")).sendKeys(nickname);

WebElement qn = driver.findElement(By.xpath("//select[@id='security-question']"));
Select securityqn = new Select(qn);
securityqn.selectByIndex(2);
driver.findElement(By.xpath("//input[@id='security-answer']")).sendKeys("sfsdfsfff");
driver.findElement(By.xpath("input[@id='18+-0']")).click();
driver.findElement(By.xpath("input[@id='tAndC']")).click();

driver.findElement(By.xpath("//input[@id='submit']")).click();
Thread.sleep(10000);

WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = driver.findElement(By.xpath("//div[@class='centered']//a[@class='logout']"));


wait.until(ExpectedConditions.visibilityOf(element));
System.out.println(element.isDisplayed());
        		
			t.insert("Registration", "pass","VIPCasino","http://www-sit.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","SIT");
			capturescreenshot("VIPCasinoRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","VIPCasino","http://www-sit.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","SIT");
			capturescreenshot("VIPCasinoRegistration");
		}

	}

	private void SpelHallenLogin() {

try
		{
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bspel1");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");	
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","spelhallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
		capturescreenshot("spelhallenLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login","fail","spelhallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
			capturescreenshot("spelhallenLogin");
			
		}

		

	}

	private void SpelHallenRegistration() {
		try {

			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);

			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("9908025967");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			t.insert("Registration", "pass","SpelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
			capturescreenshot("SpelHallenRegistration");
		} catch (Exception e) {
			e.printStackTrace();
			t.insert("Registration", "fail","SpelHallen","http://www-sit.spelhallen.com/content/spelhallen/sv.html","SIT");
			capturescreenshot("SpelHallenRegistration");
		}

	}

	private void SlotNGamesLogin() {
		
    try
		{
    	
    	System.out.println("Slot N Games Login");
    	
    	Thread.sleep(2000);
    	
    	  
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_sngm01");
  		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
  		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  		WebDriverWait wait = new WebDriverWait(driver, 5);
  		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
       	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
       	
       	System.out.println(logout.isDisplayed());
    	
    	
		
		/*driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MrT_gopika94");
		driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());*/
		t.insert("Login", "pass","slotsngames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
		capturescreenshot("slotsngamesLogin");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("Login", 

"fail","slotsngames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
			capturescreenshot("SlotngamesLogin");
			
		}
		

	}

	private void SlotNGamesRegistration() {

		try {
			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);


			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("79$99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			t.insert("Registration", "pass","SlotNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
			capturescreenshot("SlotNGamesRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","SlotNGames","http://www-sit.slotsngames.co.uk/content/slotsngames/en.html","SIT");
			capturescreenshot("SlotNGamesRegistration");
		}

	}

	private void OkBingoLogin() {
		
		try
		{
			WebElement button = driver.findElement(By
					.xpath("//div[@class='btn-panel custom']/a[1]"));

			//System.out.println(button.isDisplayed());
			button.click();
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
					.sendKeys("sit_okbingo56");
			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
					.sendKeys("password");

			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
					.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement logout = driver.findElement(By
					.xpath("//a[@class='btn btn-logout']"));
			WebElement element = wait.until(ExpectedConditions
					.visibilityOf(logout));
			System.out.println(element.isDisplayed());
		t.insert("Login", "pass","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
		capturescreenshot("OkBingoLogin");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("Login", "fail","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
			capturescreenshot("OkBingoLogin");
			
		}

		
		}
		
		
	

	private void OkBingoRegistration() {
		try {
			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
Thread.sleep(3000);

			driver.findElement(
					By.xpath("//div[@class='btn-panel custom']/a[2]"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			
			t.insert("Registration", "pass","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
			capturescreenshot("OkBingoregistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","OkBingo","http://www-sit.okbingo.co.uk/content/okbingo/en.html","SIT");
			capturescreenshot("OkBingoRegistration");
		}
	}

	private void RoyalGamesLogin() {
		

try
		{
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_zino123");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");	
		
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
		capturescreenshot("RoyalGamesLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
			capturescreenshot("RoyalGamesLogin");
			
		}

		

	}

	private void RoyalGamesRegistration() {
		try {
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);

			

			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			
			Thread.sleep(30000);

			//WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));
			
			
		       
			t.insert("Registration", "pass","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
			capturescreenshot("RoyalGamesRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","RoyalGames","http://www-sit.bingozino.com/content/bingozino/en.html","SIT");
			capturescreenshot("RoyalGamesRegistration");
		}

	}

	private void RoyalSEKLogin() {

try
		{
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bRoyals2");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");	
		
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","RoyalSEK","http://www-sit.bingozino.se/content/bingozinose/sv.html","SIT");
		capturescreenshot("RoyalSEKLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","RoyalSEK","http://www-sit.bingozino.se/content/bingozinose/sv.html","SIT");
			capturescreenshot("RoyalSEKLogin");
			
		}

		

	}

	private void RoyalSEKRegistration() {

		try {
			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);


			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("79$99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			t.insert("Registration", "pass","RoyalSEK","http://www-sit.bingozino.se/content/bingozinose/sv.html","SIT");
			capturescreenshot("RoyalSEKRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","RoyalSEK","http://www-sit.bingozino.se/content/bingozinose/sv.html","SIT");
			capturescreenshot("RoyalSEKRegistration");
		}

	}

	private void LyckoBingoLogin() {
		
		

try
		{
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_lyckosit123");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
	
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
		capturescreenshot("LyckoBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
			capturescreenshot("LyckoBingoLogin");
			
		}

		
		

	}

	private void LyckoBingoRegistration() {

		try {
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);

			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			
			
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			
			t.insert("Registration", "pass","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
			capturescreenshot("LyckoBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","LyckoBingo","http://www-sit.lyckobingo.com/content/lyckobingo/sv.html","SIT");
			capturescreenshot("LyckoBingoRegistration");
		}

	}

	private void HappyBingoLogin() {
		
		try
		{
			
			System.out.println("Happy Bingo Login");
			WebElement button = driver.findElement(By
					.xpath("//div[@class='btn-panel custom']/a[1]"));

			System.out.println(button.isDisplayed());
			button.click();
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
					.sendKeys("sit_happy56");
			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
					.sendKeys("password");

			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
					.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement logout = driver.findElement(By
					.xpath("//a[@class='btn btn-logout']"));
			WebElement element = wait.until(ExpectedConditions
					.visibilityOf(logout));
			System.out.println(element.isDisplayed());
     	t.insert("Login", "pass","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
		capturescreenshot("HappyBingoLogin");
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("Login", "fail","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
			capturescreenshot("HappyBingoLogin");
		}

	}

	private void HappyBingoRegistration() {
		try {
			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			Thread.sleep(3000);
			
			driver.findElement(
					By.xpath("//div[@class='btn-panel custom']/a[2]"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			t.insert("Registration", "pass","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
			capturescreenshot("HappyBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","HappyBingo","http://www-sit.happybingo.com/content/happybingo/sv.html","SIT");
			capturescreenshot("HappyBingoRegistration");
		}

	}

	private void DailyStarLogin() {
		
		

try
		{
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_star56");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
	driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
		capturescreenshot("DailyStarLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login","fail","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
			capturescreenshot("DailyStarLogin");
			
		}

		
		

	}

	private void DailyStarRegistration() {
		try {
			
			

            int length = 6;
            boolean useLetters = true;
            boolean useNumbers = false;

          String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("79$99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			
		       
			t.insert("Registration", "pass","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
			capturescreenshot("DailyStarRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","DailyStar","http://www-sit.dailystargames.co.uk/content/star/en.html","SIT");
			capturescreenshot("DailyStarRegistration");
		}

	}

	private void DailyExpressLogin() {
		
		try
		{
			
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_daily7");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", 

"pass","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
		capturescreenshot("DailyExpressLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
			capturescreenshot("DailyExpressLogin");
			
		}

		
		

	}

	private void DailyExpressRegistration() {
		try {
			
			
			int length = 6;
			boolean useLetters = true;
			boolean useNumbers = false;

			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("79$99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			t.insert("Registration", "pass","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
			capturescreenshot("DailyExpressRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","DailyExpress","http://www-sit.dailyexpressgames.co.uk/content/express/en.html","SIT");
			capturescreenshot("DailyExpressRegistration");
		}

	}

	private void Club3000Login() {
		

try
		{
		
		//driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MRT_hfdy1");
		//driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		
		
	System.out.println("Club 3000 login");
	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_clb3k");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");		
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
		capturescreenshot("Club3000Login");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
			capturescreenshot("Club3000Login");
			
		}


	}

	private void Club300Registration() {
		try {
			
            int length = 6;
			boolean useLetters = true;
			boolean useNumbers = false;

			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

		       
			t.insert("Registration", "pass","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
			capturescreenshot("Club3000");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","Club3000","http://www-sit.club3000livebingo.com/content/club3000bingo/en.html","SIT");
			capturescreenshot("Club3000Registration");
		}

	}

	private void ChitChatBingoLogin() {
		System.out.println("Wait yet to right Logic");

	}

	private void ChitChatBingoRegistration() {
		try {
			
			int length = 6;

			boolean useLetters = true;
			boolean useNumbers = false;

			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			months.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("79$99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions
					.elementToBeClickable(By.id("someid")));
			System.out.println(element.isDisplayed());
			t.insert("Registration", "pass", "ChitChat","http://www-sit.chitchatbingo.co.uk/content/chitchat/en/home.html","SIT");
			capturescreenshot("ChitChatRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "ChitChat","http://www-sit.chitchatbingo.co.uk/content/chitchat/en/home.html","SIT");
			capturescreenshot("ChitChatRegistration");
		}
	}

	private void CastleBingoLogin() {
		
		try
		{
Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input"))
		.sendKeys("sit_kishore123");
driver.findElement(
		By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input"))
		.sendKeys("password");

driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver, 5);
WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
	System.out.println(element .isDisplayed());
t.insert("Login", "pass","castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
capturescreenshot("CastleBingoLogin");
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			t.insert("Login", "fail","castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoLogin");
			
			
		}
		
}

	private void CastleBingoRegistration() {
		try {
			
			

            int length = 6;
boolean useLetters = true;
boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);

Thread.sleep(2000);

driver.findElement(
		By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']")).click();		
			
			
			/*driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();*/
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			
		       
			t.insert("Registration", "pass","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","Castle","http://play-sit.castlebingo.com/content/castle/en.html","SIT");
			capturescreenshot("CastleBingoRegistration");
		}

		;

	}

	private void CarltonBingoLogin() {
		try
		{
			
			System.out.println("This is Carlton Bingo Login");
		
		WebElement button = driver.findElement(By
				.xpath("//div[@class='btn-panel custom']/a[1]"));

		System.out.println(button.isDisplayed());
		button.click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("Sit_bcarl4");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
				.sendKeys("password");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By
				.xpath("//a[@class='btn btn-logout']"));
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(logout));
		System.out.println(element.isDisplayed());
		t.insert("Login", "pass","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
		capturescreenshot("CarltonBingoLogin");
		
		}
		
	catch(Exception e)
	{
		e.printStackTrace();
		
		t.insert("Login", "fail","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
		capturescreenshot("CarltonBingoLogin");	
		
	}
		

		
		
	}

	private void CarltonBingoRegistration() {
		try {
			

            int length = 6;
   boolean useLetters = true;
   boolean useNumbers = false;

String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 

String username =  RandomStringUtils.random(length,useLetters,useNumbers);

String email = randomemail+"@gtech.com";

String Loginname = "MRT_"+username;

String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			Thread.sleep(3000);
			
			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[2]/div/a[2]"))
					.click();				
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			
		
			t.insert("Registration", "pass","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
			capturescreenshot("CarltonBingoRegistration");
		}

		catch (Exception e) {
			
			e.printStackTrace();
			t.insert("Registration", "fail","Carlton","http://online-sit.carltonbingo.com/content/carlton/en.html","SIT");
			capturescreenshot("CarltonBingoRegistration");
		}

	}

	private void CaliberBingoLogin() {
		try
		{
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_bcali1");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
			
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
		capturescreenshot("CaliberBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CaliberBingoLogin");
			
		}

	}

	private void CaliberBingoRegistration() {
		try {
			
			int length = 6;
			boolean useLetters = true;
			boolean useNumbers = false;

			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
			WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			
			System.out.println(logout.isDisplayed());;
		      // 
			
			
			t.insert("Registration", "pass", "Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CarltonBingoRegistration");
		}

		catch (Exception e) {
			e.printStackTrace();
			t.insert("Registration", "fail", "Caliber","http://www-sit.caliberbingo.com/content/caliber/sv.html","SIT");
			capturescreenshot("CaliberBingoRegistration");
		}

	}

	private void ButlinsBingoRegistration() {
		try {
			
			int length = 6;
			boolean useLetters = true;
			boolean useNumbers = false;

			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			
			
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

			
			
			System.out.println(logout.isDisplayed());
			t.insert("BingoRegistration", "pass", "Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("ButlinsBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("ButlinsBingoRegistration");
		}
	}

	private void ButlinsBingoLogin() {

		try {
			
			System.out.println("Is it coming here");

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Sit_butins10");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
			
			
			
			/*Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@placeholder='username']"))
					.sendKeys("mrt_butgul");

			driver.findElement(By.xpath("//input[@placeholder='password']"))
					.sendKeys("111111");*/

			driver.findElement(
					By.xpath("//button[@class='loginbox-submit btn btn-login']"))
					.click();

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//a[@class='btn btn-logout']")));
			t.insert("Login", "pass", "Butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("ButlinsBingoLogin");

		}

		catch (Exception e) {

			t.insert("Login", "fail", "butlins","http://www-sit.butlinsbingo.co.uk/content/butlins/en.html","SIT");
			capturescreenshot("ButlinsBingoLogin");

		}

	}

	private void BidBingoLogin() {
		

try
		{
	
System.out.println("Bid Bingo Login");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_bid01");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
		capturescreenshot("BidBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","Bid","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoLogin");
			
		}

		
		
	}

	private void BidBingoRegistration() {
		try {
			
			int length = 6;
			int nicklength = 10;

			boolean useLetters = true;
			boolean useNumbers = false;


			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			
			
			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(day);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			Thread.sleep(30000);

			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));
		       
			t.insert("Registration", "pass", "BidBingo","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "BidBingo","http://www-sit.bidbingo.co.uk/content/bidbingo/en.html","SIT");
			capturescreenshot("BidBingoRegistration");
		}

	}

	private void BalletBingoRegistration() {
		try {
			
				

			int length = 6;
			int nicklength = 10;

			boolean useLetters = true;
			boolean useNumbers = false;


			String randomemail  = RandomStringUtils.random(length,useLetters,useNumbers); 
			
			String username =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			String email = randomemail+"@gtech.com";
			
			String Loginname = "MRT_"+username;
			
			String nickname =  RandomStringUtils.random(length,useLetters,useNumbers);
			
			 

			driver.findElement(
					By.xpath("//a[@class='btn btn-sign sign-up  ng-pristine ng-valid']"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("first-name")).sendKeys("MRT_$RANDOM");
			driver.findElement(By.id("last-name")).sendKeys("MRT_$RANDOM");

			WebElement day = driver
					.findElement(By.xpath("//select[@id='dob']"));
			Select days = new Select(day);

			days.selectByValue("10");

			WebElement month = driver.findElement(By
					.xpath("//select[@name='month']"));
			Select months = new Select(month);
			months.selectByIndex(8);

			WebElement year = driver.findElement(By
					.xpath("//select[@name='year']"));
			Select years = new Select(year);
			years.selectByIndex(4);

			WebElement gender = driver.findElement(By
					.xpath("//select[@id='gender']"));
			Select genders = new Select(gender);
			genders.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='mobilenumber']"))
					.sendKeys("99080259671");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(
					"Alkapuri");
			driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys(
					"500089");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(
					"Sweden");
			WebElement region = driver.findElement(By
					.xpath("//select[@id='region']"));
			Select regions = new Select(region);
			regions.selectByIndex(2);

			WebElement nation = driver.findElement(By
					.xpath("//select[@id='nationality']"));
			Select nationality = new Select(nation);
			nationality.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id='login-name']")).sendKeys(
					Loginname);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					email);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					nickname);
			WebElement security = driver.findElement(By
					.xpath("//select[@id='securityquestion']"));
			Select securityqn = new Select(security);
			securityqn.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='security-answer']"))
					.sendKeys("xyz");
			WebElement refer = driver.findElement(By
					.xpath("//select[@id='referral']"));
			Select referral = new Select(refer);
			referral.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='18+-0']")).click();
			driver.findElement(By.xpath("//input[@id='tAndC']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-free btn-lg']"))
					.click();
			Thread.sleep(30000);
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
			
	WebDriverWait wait = new WebDriverWait(driver, 10);

			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-logout']")));

	       
			t.insert("Registration", "pass", "BalletBingo", "http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoRegistration");
			// teardown();
		}

		catch (Exception e) {
			e.printStackTrace();
			t.insert("Registration", "fail", "BalletBingo","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoRegistration");
		}
	}

	private void BalletBingoLogin() {

try
		{
		
	
	System.out.println("THis is for Ballet Bingo Login");;
	
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("sit_ballet66");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
	
	
		//driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MrT_deepak4");
		//driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
     	t.insert("Login", "pass","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
		capturescreenshot("BalletBingoLogin");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("Login", "fail","Ballet","http://se-sit.balletbingo.com/content/balletbingo/sv.html","SIT");
			capturescreenshot("BalletBingoLogin");
			
		}

	}

	/*
	 * public void GMSPlayerCreation() { try {
	 * System.out.println("Executing Player Creation");
	 * 
	 * driver.findElement(By.id("gkl")).sendKeys("1");
	 * driver.findElement(By.id("gkp")).sendKeys("1"); driver.findElement(
	 * By.xpath(
	 * "//div[@class='control-group']/input[@class='btn btn-block btn-large btn-primary']"
	 * )) .click(); WebDriverWait wait = new WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
	 * .xpath("//a[@class='dropdown-toggle']")))); Thread.sleep(5000);
	 * driver.findElement(By.xpath("//span[@class='badge badge-inverse']"))
	 * .click(); Thread.sleep(5000);
	 * 
	 * driver.findElement(By.xpath("//div[@id='selectPartners']/div/a"))
	 * .click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(
	 * By.xpath("//ul[@class='select2-results']//li[contains(.,'CHITCHAT')]"))
	 * .click();
	 * 
	 * driver.findElement(By.xpath("//button[contains(.,'Change')]")) .click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(
	 * By.xpath("//li[@class='tabname']/a[contains(.,'Players')]")) .click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
	 * .xpath("//input[@id='value_criteria']"))));
	 * 
	 * Thread.sleep(3000);
	 * 
	 * driver.findElement( By.xpath("//button[@id='addCreatePlayerButton_0']"))
	 * .click();
	 * 
	 * t.insert("Playercreation", "pass"); capturescreenshot("Playercreation");
	 * 
	 * }
	 * 
	 * catch (Exception e) {
	 * 
	 * t.insert("Playercreation", "pass"); capturescreenshot("Playercreation");
	 * 
	 * }
	 * 
	 * }
	 */

	private void TabsNavigation() {

	}

	private void TicketCreation() {

	}

	public void capturescreenshot(String tcname) {

		f1.mkdir();

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		try {

			System.out.println("Path is" + " " + destination + "/" + tcname
					+ ".png");

			FileUtils.copyFile(scrFile, new File(destination + "/" + tcname
					+ ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void teardown() {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ranantatmula\\Downloads\\chromedriver_win32\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */

		driver.close();

	}

}
