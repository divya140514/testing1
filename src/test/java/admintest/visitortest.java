package admintest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HMS.base.Testbase;
import HMS.pages.dashboardpage1;
import HMS.pages.frontofficepages;
import HMS.pages.loginpage;
import HMS.pages.visitorpage;



public class visitortest extends Testbase 
{
	loginpage logobj;
	dashboardpage1 dashobj;
    frontofficepages ffobj;
	visitorpage visobj;
	public visitortest()
	{
		super();
	}
	
	
	@BeforeClass
	public void setup()
	{
		initilization();
		logobj=new loginpage(); 
		dashobj=logobj.login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		ffobj=dashobj.clickfrontoffice();  
		visobj=ffobj.clickvisitorbook();
		
	}
	
	@Test
	public void addvistortest()
		{
	
			String Expecttabeltitle="Visitor List";
			String expectscreentitle="Add Visitor";
			
			
			Assert.assertEquals(visobj.getfortabletitle(), Expecttabeltitle);
			visobj.clickaddvisitor();
			Assert.assertEquals(visobj.getscreentitle(), expectscreentitle);
			visobj.addvistordetail();
		}
}
	

