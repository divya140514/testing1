 package HMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.base.Testbase;

public class visitorpage extends Testbase
{
	@FindBy (css="h3.box-title")WebElement tabletitle;
	@FindBy (css="div.box-tools>a")WebElement addvisitor ;
	@FindBy (xpath="//h4[contains(text(),'Add Visitor')]")WebElement screentitle;
    @FindBy (css="form#formadd select[name='purpose']")WebElement purpose;
    @FindBy (css="form#formadd input[name='name']")WebElement pname;
    @FindBy (css="form#formadd input[name='contact']")WebElement phono;
    @FindBy (css="form#formadd input[name='id_proof']")WebElement idpro;
    @FindBy (css="form#formadd input[name='pepples']")WebElement nofper;
    @FindBy (css="form#formadd input[name='date']")WebElement dat;
    @FindBy (css="form#formadd textarea[name='note']")WebElement note;
    @FindBy (css="form#formadd input[name='file']")WebElement upfile;
    @FindBy (css="form#formadd input[name='close']")WebElement close;
    
    
public visitorpage()

{
PageFactory.initElements(driver, this);
}
public String getfortabletitle()
   {
	return tabletitle.getText();
	}
public void clickaddvisitor()
{
	addvisitor.click();
}
public String getscreentitle()
{
	
	waitforvisibility(screentitle);
	return screentitle.getText();
	
	
}
public void addvistordetail()
{
	Select drp=new Select(purpose);
	drp.selectByVisibleText("operation");
	pname.sendKeys("testing");
	phono.sendKeys("9976837273");
	idpro.sendKeys("TTS_03");
	nofper.sendKeys("7");
	note.sendKeys("test");
//	dat.click();
	
	
	
	
	
	
	
	
	//upfile.sendKeys(null);
	
}}
















