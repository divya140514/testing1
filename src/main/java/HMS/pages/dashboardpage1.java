package HMS.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 import HMS.base.Testbase;

public class dashboardpage1 extends Testbase
{
  @FindBy(css="a.dropdown-toggle>img")WebElement profile;
  @FindBy(xpath="//*[text()='Super Admin']")WebElement username;
  @FindBy(css="i.fa-sign-out")WebElement logout;
  @FindBy(css="ul.sidebar-menu>li:nth-child(1)")WebElement frontoffice;
  
  public dashboardpage1()
  {
	  PageFactory.initElements(driver, this);
  
  }
  //profile work
  public  void  profileclick()
  {
	  profile.click();
  }
  //to get username
  public String getusername()
  { 
	  waitforvisibility(username);
	  return username.getText();
  }
  
  //logout
  public  void  clicklogout()
  {
	  logout.click();
	
  }  
  //frontoffice
 
  public  frontofficepages clickfrontoffice()
  {
	  frontoffice.click();
	return new frontofficepages();
  }
 
}  
  
  
  
  
  
  
  
  
  
  
  
