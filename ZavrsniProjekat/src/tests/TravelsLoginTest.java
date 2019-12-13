package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsLogin;

public class TravelsLoginTest extends BasicTest {
	private String baseUrl = "https://phptravels.net/admin";

	@Test 
	public void basicLogin() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLogin tl = new TravelsLogin(driver);

		tl.getEmail().sendKeys("admin@phptravels.com");
		tl.getEmail().sendKeys(Keys.ENTER);
		tl.getPassword().sendKeys("demoadmin");
		tl.getPassword().sendKeys(Keys.ENTER);
		tl.getRemember().click();
		tl.getForget().click();
		tl.getLogin().click();
		
		Assert.assertTrue(tl.getReset().getText().contains("Enter your email address to reset your password"));

	}

}
