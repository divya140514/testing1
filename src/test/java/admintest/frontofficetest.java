package admintest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HMS.base.Testbase;
import HMS.pages.dashboardpage1;
import HMS.pages.frontofficepages;
import HMS.pages.loginpage;

public class frontofficetest extends Testbase 
{

	loginpage logobj;
	dashboardpage1 dashobj;
    frontofficepages ffobj;
	
	@BeforeClass
	public void setup()
	{
        initilization();
		logobj=new loginpage(); 
		dashobj=logobj.login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		ffobj=dashobj.clickfrontoffice();
	}

       @Test
       public void clickonvistor()
		{
	
			String Expectedboxtitle="Appointment Details";
			Assert.assertEquals(ffobj.gettabletitle(), Expectedboxtitle);
			ffobj.clickvisitorbook();
			
	  
} 
       
@AfterClass
public void teardown()
{	driver.close();
}





}

