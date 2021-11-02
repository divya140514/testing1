package admintest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HMS.base.Testbase;

import HMS.pages.dashboardpage1;
import HMS.pages.loginpage;

public class dashboardtest extends Testbase
{
	loginpage logobj;
	dashboardpage1 dashobj;
	
	 
	public dashboardtest()
	{
		super();
	}
	@BeforeClass
	public void setup()
	{
        initilization();
		logobj=new loginpage(); 
		dashobj=logobj.login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
	}
	@Test
	public void dashboardtest()
	
	{
		dashobj.profileclick();
		String Expectedname="Super Admin";
		Assert.assertEquals(dashobj.getusername(), Expectedname);
		dashobj.clicklogout();
	}
	@AfterClass
	public void teardown() 
	{
		driver.close();
	}

}








