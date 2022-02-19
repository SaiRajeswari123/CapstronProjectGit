package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import DeleteCustomer.Delete_Customer;

public class DeleteCustomerTestCase extends Base {
	public Delete_Customer dc;
	public DeleteCustomerTestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	 @BeforeMethod
	 public void SSetUp() throws IOException, InterruptedException {
	 dc = new Delete_Customer();
	 }
	@Test
	public void validateDelete() throws IOException {
		dc.deleteOperation( prop.getProperty("invalidCustomerId")); }
		}

