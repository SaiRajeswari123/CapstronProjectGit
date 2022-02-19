package AddCustomer;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class AddNewCustomer extends Base {

	@FindBy(xpath = "//input[@name='uid']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//*[contains(@type,'submit')]")
	WebElement LoginButton;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement button;

	@FindBy(xpath = "//input[@name='name']")
	WebElement name;

	@FindBy(xpath = "//input[@type='radio'][2]")
	WebElement radiobut;

	@FindBy(xpath = "//input[@type='date']")
	WebElement dob;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='state']")
	WebElement state;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement phoneNo;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement pssword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//p[text()='Customer Registered Successfully!!!']")
	WebElement sussmsg;

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")
	WebElement custid;

	public AddNewCustomer() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void detailsentry(String un, String pwd) throws IOException, InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		button.click();
		name.sendKeys("Sai Rajeswari");
		radiobut.click();
		dob.sendKeys("03-11-1999");
		address.sendKeys("NorthRajupalem");
		city.sendKeys("Nellore");
		state.sendKeys("AP");
		pin.sendKeys("524366");
		phoneNo.sendKeys("9869874589");
		email.sendKeys("rajeswari@gmail.com");
		pssword.sendKeys("1234567894");
		submit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement Customerid = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]"));
		Boolean ValidatingCustomerId = Customerid.isDisplayed();
		System.out.println("The Custmer_ID displayed: " + ValidatingCustomerId);

	}

}
