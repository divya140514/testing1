package HMS.utility;

import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import HMS.base.Testbase;

public class commonutility extends Testbase
{
	 
	public static void mouseclick(WebElement el)
	{
		Actions act=new Actions (driver);
		act.click(el).build().perform();
		
	}	//method to upload file
	public static void fileupload(String loc)
		{
			//file location to upload
		//	Stringselection sel=new Stringselection(loc);
			//copy to clipboard
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
			//create object to robot class
			Robot robot;
		    try {
		    	robot=new Robot();
		    }}	    	Thread.sleep(4000);
		//     }}}
