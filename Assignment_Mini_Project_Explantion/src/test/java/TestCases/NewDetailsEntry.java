package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AddCustomer.AddNewCustomer;
import BasePackage.Base;
import DeleteCustomer.Delete_Customer;
import PageLayer.LoginPage;

public class NewDetailsEntry extends Base {
	public AddNewCustomer ad;

	public NewDetailsEntry() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	// Step2

	@BeforeMethod
	public void SetUpLaunch() throws IOException, InterruptedException {
		ad = new AddNewCustomer();
	}

	@Test
	public void validateNewDetails() throws IOException, InterruptedException {
		ad.detailsentry(prop.getProperty("username"), prop.getProperty("password"));

	}

}
