package admintest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.base.Testbase;
import HMS.pages.loginpage;

public class logintest extends Testbase 
  {
    loginpage logobj;
    
    public logintest()
    {
    	super();
    	
    }
    
    @BeforeClass
    public void setup()
    {
    	initilization();
    	logobj=new loginpage();
    }
    @Test
    public void  login()
    {
    	String ExpetctTitle="Smart Hospital : Hospital Management System";
        Assert.assertEquals(logobj.pagetitle(), ExpetctTitle);
        Assert.assertTrue(logobj.logotest());
        String expectedfrmname="Admin Login";
        Assert.assertEquals(logobj.frmtitle(), expectedfrmname);
        logobj.login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
        
        
    }
	   
	@AfterClass
	public void teardown() 
	{
		
		driver.close();
	}
	   
	   
	   
	   
	   
	   
	 
	   
	   
	   
	   
	   
	   
   }
