  
package HMS.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.base.Testbase;

public class frontofficepages extends Testbase
    {
	 @FindBy(css="h3.box-title")WebElement tabletitle;
	 @FindBy(css="div.box-tools>a:nth-child(2)")WebElement visitorbook;
	 
	 
	 public frontofficepages()
	  {
		 PageFactory.initElements(driver, this);
	  }
	 
	 
	 
	  public String gettabletitle()
	  
	  {
 		  return  tabletitle.getText();
 		  
	  }
	     public  visitorpage  clickvisitorbook()
	  {
		  visitorbook.click();
		return new visitorpage();
		

      }
	     
    
    
    
    }