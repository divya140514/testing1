 package HMS.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	 public static WebDriver driver;
	 public static  Properties prop;
	 public Testbase()
	 { 
		 prop=new Properties();
		 try {
			
			  FileInputStream fconfig=new FileInputStream("./src/main/java/HMS/config/config.properties");
		      prop.load(fconfig);
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		  
	 public static void initilization()
	 {
		 String browsername=prop.getProperty("BROWSER");
		 if(browsername.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			 
		 }else if(browsername.equals("edge"))
		 {
			 System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/chromedriver.exe");
			 driver=new EdgeDriver();
			 
		 }
		//basic methods
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		 driver.get(prop.getProperty("URL"));
       }
	 public  void waitforvisibility(WebElement el)
	 {
		 WebDriverWait wt=new WebDriverWait(driver,50);
		 wt.until(ExpectedConditions.visibilityOf(el));
	 
}	 


}