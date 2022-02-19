package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class LoginPageTest extends Base {
	public LoginPage lp;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	 //Step2

	@BeforeMethod 
	public void SetUpLaunch() throws IOException, InterruptedException {
	     lp=new LoginPage();	
	}
	@Test
	public void validateTitle() throws IOException, InterruptedException
	{
		lp.logincheck(prop.getProperty("username"), prop.getProperty("password"));
	
	}
   
}
