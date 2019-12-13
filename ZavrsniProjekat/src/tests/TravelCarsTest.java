package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsLogin;
import pages.TravelsMenu;

public class TravelCarsTest extends BasicTest {

	private String baseUrl = "https://phptravels.net/admin";
	
	@Test (priority = 0)
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
	public void basicCars() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);
	
		TravelsMenu tm = new TravelsMenu(driver);
		
		tm.getCars().click();
		Thread.sleep(1000);
		tm.getCars2().click();
		Thread.sleep(2000);
		
        TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));
	}
}
