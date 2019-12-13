package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelCustomer;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelsMenuTest extends BasicTest {
	private String baseUrl = "https://phptravels.net/admin";


	@Test(priority = 0)
	public void basicLogin() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);

		tl.getEmail().sendKeys("admin@phptravels.com");
		tl.getPassword().sendKeys("demoadmin");
		tl.getLogin().click();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	}

	@Test(priority = 1)
	public void updateTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getUpdates().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Updates"));

	}

	@Test(priority = 2)
	public void modulesTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getModules().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Modules"));

	}

	@Test(priority = 3)
	public void toursTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getTours().click();
		Thread.sleep(1000);
		tm.getAddNew().click();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Add Tour"));

	}

	@Test(priority = 4)
	public void carsTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getCars().click();
		tm.getCars2().click();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));

	}

	@Test(priority = 5)
	public void couponsTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getCoupons().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Coupon Codes Management"));

	}

	@Test(priority = 6)
	public void newsletterTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getNewsletter().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Newsletter Management"));

	}

	@Test(priority = 7)
	public void bookingsTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getBookings().click();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Booking Management"));

	}

	@Test(priority = 9)
	public void editCustomersTest() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);

		tm.getAccounts().click();
		Thread.sleep(1000);
		tm.getCustomers().click();
		Thread.sleep(1000);

		TravelCustomer tc = new TravelCustomer(driver);

		tc.getEdit().click();
		Thread.sleep(1000);

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Update Customer"));

	}

}
