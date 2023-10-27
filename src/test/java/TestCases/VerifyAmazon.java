package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.PageObjects;
import Resource.BaseClass;

public class VerifyAmazon extends BaseClass{

	@Test
	public void Login() throws IOException, InterruptedException
	{
		driverInitialize();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		PageObjects po=new PageObjects(driver);

		po.clickOnHamburger().click();
		Thread.sleep(2000);

		po.clickOnElectronics().click();
		Thread.sleep(2000);

		po.clickCellphone().click();
		Thread.sleep(3000);

		po.clickOnproduct().click();
		Thread.sleep(3000);

		po.clickOnCart().click();
		Thread.sleep(3000);

		po.clickOnViewCart().click();
		Thread.sleep(3000);

		po.clickOnCheckout().click();
		Thread.sleep(3000);

		driver.close();

	}
}
