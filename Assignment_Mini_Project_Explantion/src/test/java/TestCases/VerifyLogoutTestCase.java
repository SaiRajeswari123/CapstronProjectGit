package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;

import VerifyLogout.VerifyLogout;

public class VerifyLogoutTestCase extends Base {
	public VerifyLogout vlo;

	public VerifyLogoutTestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException {
		vlo = new VerifyLogout();
	}

	@Test
	public void validateLogin() throws IOException, InterruptedException {
		vlo.loginDetails1(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("Homeurl"));

	}

}
