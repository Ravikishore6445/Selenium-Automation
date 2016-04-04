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

public class testexecute {

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

		if (URL.equalsIgnoreCase("https://www.se.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			String tcaseselected = "Login";

			BalletBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.se.balletbingo.com/content/balletbingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			String tcaseselected = "Registration gd";

			BalletBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.bidbingo.co.uk/content/bidbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			String tcaseselected = "Registration";

			BidBingoRegistration();

		}
		
		if (URL.equalsIgnoreCase("https://www.bidbingo.co.uk/content/bidbingo/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			String tcaseselected = "Login";

			BidBingoLogin();

		}
		

		if (URL.equalsIgnoreCase("https://www.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			ButlinsBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.butlinsbingo.co.uk/content/butlins/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			ButlinsBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CaliberBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.caliberbingo.com/content/caliber/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CaliberBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://online.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CarltonBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://online.carltonbingo.com/content/carlton/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CarltonBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://play.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			CastleBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://play.castlebingo.com/content/castle/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			CastleBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.chitchatbingo.co.uk/content/chitchat/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			ChitChatBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.castlebingo.com/content/castle/en.html")
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

		if (URL.equalsIgnoreCase("https://www.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			Club300Registration();

		}

		if (URL.equalsIgnoreCase("https://www.club3000livebingo.com/content/club3000bingo/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			Club3000Login();

		}

		if (URL.equalsIgnoreCase("https://www.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			DailyExpressRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.dailyexpressgames.co.uk/content/express/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			DailyExpressLogin();

		}

		if (URL.equalsIgnoreCase("https://www.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			DailyStarRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.dailystargames.co.uk/content/star/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			DailyStarLogin();

		}

		if (URL.equalsIgnoreCase("https://www.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			HappyBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.happybingo.com/content/happybingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			HappyBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			LyckoBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.lyckobingo.com/content/lyckobingo/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			LyckoBingoLogin();

		}

		if (URL.equalsIgnoreCase("https://www.bingozino.se/content/bingozinose/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			RoyalSEKRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.bingozino.se/content/bingozinose/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			RoyalSEKLogin();
		}

		if (URL.equalsIgnoreCase("https://www.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			RoyalGamesRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.bingozino.com/content/bingozino/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			RoyalGamesLogin();
		}

		if (URL.equalsIgnoreCase("https://www.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			OkBingoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			OkBingoLogin();
		}

		/*if (URL.equalsIgnoreCase("https://www.okbingo.co.uk/content/okbingo/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			OkBingoRegistration();

		}*/

		

		if (URL.equalsIgnoreCase("https://www.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			SlotNGamesRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.slotsngames.co.uk/content/slotsngames/en.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			SlotNGamesLogin();
		}

		if (URL.equalsIgnoreCase("https://www.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			SpelHallenRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.spelhallen.com/content/spelhallen/sv.html")
				&& (tcase.equalsIgnoreCase("Login"))) {

			SpelHallenLogin();
		}

		if (URL.equalsIgnoreCase("https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en.html")
				&& (tcase.equalsIgnoreCase("Registration"))) {

			VIPCasinoRegistration();

		}

		if (URL.equalsIgnoreCase("https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en.html")
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

	private void OLGEditLimits() {
		
		try
		{
		
		driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
		.sendKeys("smokeptest10");
		
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
		.sendKeys("Password7");
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
		.sendKeys("smokeptest10");
		
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
		.sendKeys("Password7");
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
t.insert("ViewHistory", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
capturescreenshot("ViewHistory");

		}
		
		
		catch(Exception e)
		{
			
			t.insert("ViewHistory", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
			capturescreenshot("ViewHistory");
			
		}
	}

	private void OLGDeposit()  {
		
		try
		{
			System.out.println("This is for Deposit");
			driver.findElement(By.xpath("//input[@id='olglogin1_username']"))
			.sendKeys("smokeptest10");
			
			driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='olglogin1_password']"))
			.sendKeys("Password7");
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

t.insert("Deposit", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
capturescreenshot("OLGDepsosit");

		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("Deposit", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
			capturescreenshot("OLGDepsosit");
			
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

			t.insert("Login", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
			capturescreenshot("OLGLogin");

		}

		catch (Exception e) {
			t.insert("Login", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
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
	driver.findElement(By.xpath("//input[@id='olgregistration_0_password']")).sendKeys("Password7");
	driver.findElement(By.xpath("//input[@id='olgregistration_0_password2']")).sendKeys("Password7");

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
t.insert("Registration", "pass","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
capturescreenshot("OLGRegistration");

		}
		
		
		catch(Exception e)
		{
			
			t.insert("Registration", "fail","OLG","https://test-cdt52-portal.g2-networks.com/content/olg/en/account/login.html","OLG");
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
		t.insert("Login", "pass", "VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","LIVE");
		capturescreenshot("VIPCasinoLogin");
		}
		
		catch(Exception e)
		{
			t.insert("Login", "fail", "VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en/home.html","LIVE");
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
driver.findElement(By.xpath("//input[@id='mobilenumber']")).sendKeys("DynamicINT");
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
        		
			t.insert("Registration", "pass","VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en.html","LIVE");
			capturescreenshot("VIPCasinoRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","VIPCasino","https://www.vipcasinoclub.co.uk/content/vipcasinoclub/en.html","LIVE");
			capturescreenshot("VIPCasinoRegistration");
		}

	}

	private void SpelHallenLogin() {

try
		{
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Mrt_spelmi≈");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");	
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","spelhallen","https://www.spelhallen.com/content/spelhallen/sv.html","LIVE");
		capturescreenshot("spelhallenLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login","fail","spelhallen","https://www.spelhallen.com/content/spelhallen/sv.html","LIVE");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","SpelHallen","https://www.spelhallen.com/content/spelhallen/sv.html","LIVE");
			capturescreenshot("SpelHallenRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","SpelHallen","https://www.spelhallen.com/content/spelhallen/sv.html","LIVE");
			capturescreenshot("SpelHallenRegistration");
		}

	}

	private void SlotNGamesLogin() {
		
    try
		{
    	
    	System.out.println("Slot N Games Login");
    	
    	Thread.sleep(2000);
    	
    	  
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MrT_gopika94");
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
		t.insert("Login", "pass","slotsngames","https://www.slotsngames.co.uk/content/slotsngames/en.html","LIVE");
		capturescreenshot("slotsngamesLogin");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("Login", 

"fail","slotsngames","https://www.slotsngames.co.uk/content/slotsngames/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","SlotNGames","https://www.slotsngames.co.uk/content/slotsngames/en.html","LIVE");
			capturescreenshot("SlotNGamesRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","SlotNGames","https://www.slotsngames.co.uk/content/slotsngames/en.html","LIVE");
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
					.sendKeys("MrT_ok01");
			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/div[2]/div[1]/input"))
					.sendKeys("111111");

			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[1]/section[1]/div/div/div/div/div[1]/form/button"))
					.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement logout = driver.findElement(By
					.xpath("//a[@class='btn btn-logout']"));
			WebElement element = wait.until(ExpectedConditions
					.visibilityOf(logout));
			System.out.println(element.isDisplayed());
		t.insert("Login", "pass","OkBingo","https://www.okbingo.co.uk/content/okbingo/en.html","LIVE");
		capturescreenshot("OkBingoLogin");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			t.insert("Login", "fail","OkBingo","https://www.okbingo.co.uk/content/okbingo/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			
			t.insert("Registration", "pass","OkBingo","https://www.okbingo.co.uk/content/okbingo/en.html","LIVE");
			capturescreenshot("OkBingoregistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","OkBingo","https://www.okbingo.co.uk/content/okbingo/en.html","LIVE");
			capturescreenshot("OkBingoRegistration");
		}
	}

	private void RoyalGamesLogin() {
		

try
		{
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Mrt_uild1");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");	
		
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","RoyalGames","https://www.bingozino.com/content/bingozino/en.html","LIVE");
		capturescreenshot("RoyalGamesLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","RoyalGames","https://www.bingozino.com/content/bingozino/en.html","LIVE");
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
					.sendKeys("DynamicINT");
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
					"MRT_$RANDOM");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
					"MRT_$RANDOMravi9@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
					"password");
			driver.findElement(By.xpath("//input[@id='confirmpass']"))
					.sendKeys("password");
			driver.findElement(By.xpath("//input[@id='nick-name']")).sendKeys(
					"MRT_$RANDOMs");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","RoyalGames","https://www.bingozino.com/content/bingozino/en.html","LIVE");
			capturescreenshot("RoyalGamesRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","RoyalGames","https://www.bingozino.com/content/bingozino/en.html","LIVE");
			capturescreenshot("RoyalGamesRegistration");
		}

	}

	private void RoyalSEKLogin() {
		System.out.println("Wait yet to right Logic");

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
					.sendKeys("79$DYNAMIC_INT");
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
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","RoyalSEK","https://www.bingozino.se/content/bingozinose/sv.html","LIVE");
			capturescreenshot("RoyalSEKRegistration");
		} catch (Exception e) {
			t.insert("Registration", "fail","RoyalSEK","https://www.bingozino.se/content/bingozinose/sv.html","LIVE");
			capturescreenshot("RoyalSEKRegistration");
		}

	}

	private void LyckoBingoLogin() {
		
		

try
		{
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MRT_lycko12345");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
	
			driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Caliber","https://www.lyckobingo.com/content/lyckobingo/sv.html","LIVE");
		capturescreenshot("LyckoBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","Caliber","https://www.caliberbingo.com/content/caliber/sv.html","LIVE");
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
					.sendKeys("DynamicINT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			
			t.insert("Registration", "pass","LyckoBingo","https://www.lyckobingo.com/content/lyckobingo/sv.html","LIVE");
			capturescreenshot("LyckoBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","LyckoBingo","https://www.lyckobingo.com/content/lyckobingo/sv.html","LIVE");
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
					.sendKeys("Mrt_rk123");
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
     	t.insert("Login", "pass","HappyBingo","https://www.happybingo.com/content/happybingo/sv.html","LIVE");
		capturescreenshot("HappyBingoLogin");
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			t.insert("Login", "fail","HappyBingo","https://www.happybingo.com/content/happybingo/sv.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","HappyBingo","https://www.happybingo.com/content/happybingo/sv.html","LIVE");
			capturescreenshot("HappyBingoRegistration");
		}

		catch (Exception e) {
			
			e.printStackTrace();
			t.insert("Registration", "fail","HappyBingo","https://www.happybingo.com/content/happybingo/sv.html","LIVE");
			capturescreenshot("HappyBingoRegistration");
		}

	}

	private void DailyStarLogin() {
		
		

try
		{
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("mrtdsgames2");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("111111");
	driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","DailyStar","https://www.dailystargames.co.uk/content/star/en.html","LIVE");
		capturescreenshot("DailyStarLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login","fail","DailyStar","https://www.dailystargames.co.uk/content/star/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","DailyStar","https://www.dailystargames.co.uk/content/star/en.html","LIVE");
			capturescreenshot("DailyStarRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","DailyStar","https://www.dailystargames.co.uk/content/star/en.html","LIVE");
			capturescreenshot("DailyStarRegistration");
		}

	}

	private void DailyExpressLogin() {
		
		try
		{
			
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MrT_daily12");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", 

"pass","DailyExpress","https://www.dailyexpressgames.co.uk/content/express/en.html","LIVE");
		capturescreenshot("DailyExpressLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","DailyExpress","https://www.dailyexpressgames.co.uk/content/express/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
					"MRT_$RANDOM");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			
			t.insert("Registration", "pass","DailyExpress","https://www.dailyexpressgames.co.uk/content/express/en.html","LIVE");
			capturescreenshot("DailyExpressRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","DailyExpress","https://www.dailyexpressgames.co.uk/content/express/en.html","LIVE");
			capturescreenshot("DailyExpressRegistration");
		}

	}

	private void Club3000Login() {
		

try
		{
		
		//driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MRT_hfdy1");
		//driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		
		
	System.out.println("Club 3000 login");
	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MRT_hfdy1");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");		
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Club3000","https://www.club3000livebingo.com/content/club3000bingo/en.html","LIVE");
		capturescreenshot("Club3000Login");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","Club3000","https://www.club3000livebingo.com/content/club3000bingo/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","Club3000","https://www.club3000livebingo.com/content/club3000bingo/en.html","LIVE");
			capturescreenshot("Club3000");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","Club3000","https://www.club3000livebingo.com/content/club3000bingo/en.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			t.insert("Registration", "pass", "ChitChat","https://www.chitchatbingo.co.uk/content/chitchat/en.html","LIVE");
			capturescreenshot("ChitChatRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "ChitChat","https://www.chitchatbingo.co.uk/content/chitchat/en.html","LIVE");
			capturescreenshot("ChitChatRegistration");
		}
	}

	private void CastleBingoLogin() {
		
		try
		{
Thread.sleep(2000);		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input"))
		.sendKeys("Mrt_kishore123");
driver.findElement(
		By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input"))
		.sendKeys("password");

driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver, 5);
WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
	System.out.println(element .isDisplayed());
t.insert("Login", "pass","castle","https://play.castlebingo.com/content/castle/en.html","LIVE");
capturescreenshot("CastleBingoLogin");
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			t.insert("Login", "fail","castle","https://play.castlebingo.com/content/castle/en.html","LIVE");
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
					.sendKeys("DynamicINT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass","Castle","https://play.castlebingo.com/content/castle/en.html","LIVE");
			capturescreenshot("CastleBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","Castle","https://play.castlebingo.com/content/castle/en.html","LIVE");
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
				.sendKeys("Mrt_kishore123");
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
		t.insert("Login", "pass","Carlton","https://online.carltonbingo.com/content/carlton/en.html","LIVE");
		capturescreenshot("CarltonBingoLogin");
		
		}
		
	catch(Exception e)
	{
		e.printStackTrace();
		
		t.insert("Login", "fail","Carlton","https://online.carltonbingo.com/content/carlton/en.html","LIVE");
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
					.sendKeys("DynamicINT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			
		
			t.insert("Registration", "pass","Carlton","https://online.carltonbingo.com/content/carlton/en.html","LIVE");
			capturescreenshot("CarltonBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail","Carlton","https://online.carltonbingo.com/content/carlton/en.html","LIVE");
			capturescreenshot("CarltonBingoRegistration");
		}

	}

	private void CaliberBingoLogin() {
		try
		{
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MRT_kishore1234");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
			
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Caliber","https://www.caliberbingo.com/content/caliber/sv.html","LIVE");
		capturescreenshot("CaliberBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","Caliber","https://www.caliberbingo.com/content/caliber/sv.html","LIVE");
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
					.sendKeys("79$DYNAMIC_INT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			
			
			t.insert("Registration", "pass", "Caliber","https://www.caliberbingo.com/content/caliber/sv.html","LIVE");
			capturescreenshot("CarltonBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "Caliber","https://www.caliberbingo.com/content/caliber/sv.html","LIVE");
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
					.sendKeys("DynamicINT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			//System.out.println(element.isDisplayed());
			t.insert("BingoRegistration", "pass", "Butlins","https://www.butlinsbingo.co.uk/content/butlins/en.html","LIVE");
			capturescreenshot("ButlinsBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "Butlins","https://www.butlinsbingo.co.uk/content/butlins/en.html","LIVE");
			capturescreenshot("ButlinsBingoRegistration");
		}
	}

	private void ButlinsBingoLogin() {

		try {
			
			System.out.println("Is it coming here");

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("mrt_butgul");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("111111");
			
			
			
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
			t.insert("Login", "pass", "Butlins","https://www.butlinsbingo.co.uk/content/butlins/en.html","LIVE");
			capturescreenshot("ButlinsBingoLogin");

		}

		catch (Exception e) {

			t.insert("Login", "fail", "butlins","https://www.butlinsbingo.co.uk/content/butlins/en.html","LIVE");
			capturescreenshot("ButlinsBingoLogin");

		}

	}

	private void BidBingoLogin() {
		

try
		{
	
System.out.println("Bid Bingo Login");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("Mrt_bid");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Bid","https://www.bidbingo.co.uk/content/bidbingo/en.html","LIVE");
		capturescreenshot("BidBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", 

"fail","Bid","https://www.bidbingo.co.uk/content/bidbingo/en.html","LIVE");
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
					.sendKeys("DynamicINT");
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
		       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass", "BidBingo","https://www.bidbingo.co.uk/content/bidbingo/en.html","LIVE");
			capturescreenshot("BidBingoRegistration");
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "BidBingo","https://www.bidbingo.co.uk/content/bidbingo/en.html","LIVE");
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
					.sendKeys("DynamicINT");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
					"floatilla");
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(
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
			WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
	       wait.until(ExpectedConditions.visibilityOf(logout));;
			t.insert("Registration", "pass", "BalletBingo", "https://www.se.balletbingo.com/content/balletbingo/sv.html","LIVE");
			capturescreenshot("BalletBingoRegistration");
			// teardown();
		}

		catch (Exception e) {
			t.insert("Registration", "fail", "BalletBingo","https://www.se.balletbingo.com/content/balletbingo/sv.html","LIVE");
			capturescreenshot("BalletBingoRegistration");
		}
	}

	private void BalletBingoLogin() {

try
		{
		
	
	System.out.println("THis is for Ballet Bingo Login");;
	
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[1]/div/div[1]/input")).sendKeys("MrT_deepak4");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div[2]/section[1]/div[1]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("password");
	
	
		//driver.findElement(By.xpath("//input[@id='gkl']")).sendKeys("MrT_deepak4");
		//driver.findElement(By.xpath("//input[@id='gkp']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='loginbox-submit btn btn-login']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement logout = driver.findElement(By.xpath("//a[@class='btn btn-logout']")) ;
     	WebElement element = wait.until(ExpectedConditions.visibilityOf(logout));
     	System.out.println(element .isDisplayed());
		t.insert("Login", "pass","Ballet","https://www.se.balletbingo.com/content/balletbingo/sv.html","LIVE");
		capturescreenshot("BalletBingoLogin");
		}
		
		catch(Exception e)
		{
			
			t.insert("Login", "fail","Ballet","https://www.se.balletbingo.com/content/balletbingo/sv.html","LIVE");
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
