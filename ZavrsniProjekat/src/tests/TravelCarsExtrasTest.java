package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;

import pages.TravelsCars;
import pages.TravelsCarsExtras;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelCarsExtrasTest extends BasicTest {
	
	private String baseUrl = "https://phptravels.net/admin";

	@Test(priority = 0)
	public void basicLogin() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);

		tl.getEmail().sendKeys("admin@phptravels.com");
		tl.getPassword().sendKeys("demoadmin");
		tl.getRemember().click();
		tl.getLogin().click();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);

		Assert.assertEquals(tp.getPageTitle(), "Dashboard");

	}

	@Test(priority = 1)
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

	@Test(priority = 2)

	public void numOfRows() throws InterruptedException {

		TravelsCars tc = new TravelsCars(driver);
		Assert.assertFalse(tc.carsList().size() == 10);
	}

	@Test(priority = 3)

	public void numOfOrders() throws InterruptedException {

		TravelsCars tc = new TravelsCars(driver);
		Assert.assertFalse(tc.getOrders() > 50);
	}

	@Test(priority = 4)
	public void basicAdd() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);

		tm.getCars().click();
		Thread.sleep(1000);
		tm.getExtras().click();
		Thread.sleep(2000);

		tce.getAdd().click();

		Thread.sleep(2000);

		tce.getName().sendKeys("Auto1");
		tce.getName().sendKeys(Keys.ENTER);

		Select select = new Select(tce.getStatus());
		select.selectByIndex(1);

		tce.getPrice().sendKeys("2000");
		tce.getPrice().sendKeys(Keys.ENTER);

		tce.getSave().click();
		Thread.sleep(2000);
		Assert.assertTrue(tce.getRow().getText().contains("Auto1"));
	}

	@Test(priority = 5)
	public void lettersToPrice() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);

		tm.getCars().click();
		Thread.sleep(1000);
		tm.getExtras().click();
		Thread.sleep(2000);

		tce.getAdd().click();

		Thread.sleep(2000);

		tce.getName().sendKeys("Auto1");
		tce.getName().sendKeys(Keys.ENTER);

		Select select = new Select(tce.getStatus());
		select.selectByIndex(1);

		tce.getPrice().sendKeys("ABC");
		tce.getPrice().sendKeys(Keys.ENTER);

		TitlePage tp = new TitlePage(driver);

		Assert.assertFalse(tp.getPageTitle().contains("Dashboard"));

	}

	@Test(priority = 10)
	public void uploadPicture() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsMenu tm = new TravelsMenu(driver);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);

		tm.getCars().click();
		Thread.sleep(1000);
		tm.getExtras().click();
		Thread.sleep(2000);

		tce.getAdd().click();

		Thread.sleep(500);

		tce.getUploadInput();
		tce.uploadImage("images\\porsche.jpg");

		Thread.sleep(3000);

		Assert.assertTrue(tce.getRemove().getText().contains("Remove"));
	}
}
