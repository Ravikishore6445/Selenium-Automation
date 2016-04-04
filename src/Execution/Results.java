package Execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Results {
	
			
		String tcname;
		boolean result;
		DBconnection db = new DBconnection();
		
		
		
		 //File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		/* Date d = new Date();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss") ;
			
			String foldername = dateFormat.format(d);
			
			File f1= new File("C:/Users/ranantatmula/Desktop/"+foldername);
			
			String destination = ("C:/Users/ranantatmula/Desktop/"+foldername);
			
			
			
			//f1.mkdir();*/
			
			
		
		
		
		
		
		
		
		public void insert(String tcname,String result,String site,String url,String Env)
		{
			
			
			db.insert(tcname,result,site,url,Env);
		   
		   
			
			
		}
		
		
		
		/*public void capturesnapshot(String tcname)
		{
			
			// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			f1.mkdir();
		       
	        try {
				//FileUtils.copyFile(scrFile, new File("C:/Users/ranantatmula/Desktop/abc.png"));
				
				FileUtils.copyFile(scrFile, new File(destination+tcname+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	        
			
			
			
			
		}
		

//}
