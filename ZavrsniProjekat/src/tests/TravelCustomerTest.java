package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelCustomer;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelCustomerTest extends BasicTest {
	private String baseUrl = "https://phptravels.net/admin";

	public TravelCustomerTest() {

	}

	@Test(priority = 0)
	public void loginTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);

		tl.getEmail().sendKeys("admin@phptravels.com");
		tl.getPassword().sendKeys("demoadmin");
		tl.getRemember().click();
		tl.getLogin().click();
		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Dashboard");
	}

	@Test(priority = 3)
	public void editInfoTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getAccounts().click();
		Thread.sleep(1000);
		tm.getCustomers().click();
		Thread.sleep(2000);

		TravelCustomer tc = new TravelCustomer(driver);

		tc.getEdit().click();
		Thread.sleep(1000);

		tc.getFirstName().clear();
		tc.getFirstName().sendKeys("Ime");

		tc.getLastName().clear();
		tc.getLastName().sendKeys("Prezime");

		tc.getEmail().clear();
		tc.getEmail().sendKeys("nesto@nesto.com");

		tc.getPassword().sendKeys("ImePrezime123");

		tc.getMobile().clear();
		tc.getMobile().sendKeys("123456789");

		tc.getCountry().click();
		tc.getCountryName().sendKeys("Serbia");
		tc.getCountryName().sendKeys(Keys.ENTER);

		tc.getAddress1().sendKeys("Adresa 1");
		tc.getAddress2().sendKeys("Adresa 2");

		Select select = new Select(tc.getStatus());
		select.selectByIndex(1);

		tc.getCheckbox().click();
		
		tc.iframeClose();
		
		tc.getSubmit().click();
		Thread.sleep(2000);

		tc.getSearch().click();
		tc.getSearchInput().sendKeys("Ime");
		tc.getGo().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Customers Management"));

	}

}
