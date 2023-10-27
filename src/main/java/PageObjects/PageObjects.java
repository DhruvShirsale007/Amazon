package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

	public static WebDriver driver;

	private By Hamburger=By.xpath("//i[@class='hm-icon nav-sprite']");
	private By Electronics=By.xpath("(//a[@data-menu-id='5'])[1]");
	private By CellPhone=By.xpath("//html/body/div[3]/div[2]/div/ul[33]/li[6]/a");
	private By product=By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]");
	private By Cart=By.xpath("//input[@aria-labelledby='mbc-buybutton-addtocart-1-announce']");
	private By ViewCart=By.xpath("//input[@aria-labelledby='mbc-offer-view-cart-1-announce']");
	private By Checkout=By.xpath("//input[@name='proceedToRetailCheckout']");


	public PageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement clickOnHamburger()
	{
		return driver.findElement(Hamburger);
	}
	public WebElement clickOnElectronics()
	{
		return driver.findElement(Electronics);
	}
	public WebElement clickCellphone()
	{
		return driver.findElement(CellPhone);
	}
	public WebElement clickOnproduct()
	{
		return driver.findElement(product);
	}
	public WebElement clickOnCart()
	{
		return driver.findElement(Cart);
	}
	public WebElement clickOnViewCart()
	{
		return driver.findElement(ViewCart);
	}
	public WebElement clickOnCheckout()
	{
		return driver.findElement(Checkout);
	}

}
