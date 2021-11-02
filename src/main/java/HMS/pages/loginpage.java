package HMS.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import HMS.base.Testbase;

  public class loginpage extends Testbase
  {
   //webelement
	@FindBy (css="img[style='height: 30px;']")WebElement logo;
	@FindBy (css="h3.font-white")WebElement frmname ;
	@FindBy (css="input#email")WebElement username;
    @FindBy (css="input#password")WebElement password;
    @FindBy (css="button.btn")WebElement signin;
    @FindBy (css="a.forgot")WebElement forgotpass;
    
    
    public loginpage()
    
    {
    PageFactory.initElements(driver, this);
    }

    //get page title
    public String pagetitle()
    {
    	return driver.getTitle();
    }
    
    //logo
    public boolean logotest() 
    { 
    	return logo.isDisplayed();
    }
    
    //from title
    public String frmtitle()
    {
    return frmname.getText();
    }
    
    //login
    public dashboardpage1 login(String uname, String pass)
    
    {  
    	username.sendKeys(uname);
    	password.sendKeys(pass);
    	signin.click();
		return new dashboardpage1();
		
		
		
	}
    
}