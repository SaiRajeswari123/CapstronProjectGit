package VerifyLogout;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;


public class VerifyLogout extends Base {
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutbutton;
	public VerifyLogout() throws IOException {
		 PageFactory.initElements(driver, this);
	}
	public void loginDetails1(String un, String pwd, String pageurl) throws IOException{
		logoutbutton.click();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		Assert.assertEquals(alertmsg, "You Have Succesfully Logged Out!!");
		alert.accept();
}
	
}
