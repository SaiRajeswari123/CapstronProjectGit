package PageLayer;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class LoginPage extends Base {

	@FindBy(xpath = "//input[@name='uid']")
	WebElement usernamePath;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pwdPath;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement submit_button;
	
	@FindBy(xpath = "//td[normalize-space()='Manager Id : mngr385707']")
	WebElement managerid;
	// Initializing the Page Objects:
	public LoginPage() throws IOException {
		initialization();
		PageFactory.initElements(driver, this);
	}

	// Action - validate Login and action on Elements

	public void logincheck(String un, String pwd) throws IOException, InterruptedException {
		usernamePath.sendKeys(un);
		pwdPath.sendKeys(pwd);
		submit_button.click();
		String ManagerID = "mngr385707";
		String title = driver.getTitle();
		System.out.println("verify title:" + title);
		System.out.println(ManagerID);

	}
}
