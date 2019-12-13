package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsLogin extends BasicPage {

	private By email = By.name("email");
	private By password = By.name("password");
	private By remember = By.className("checkbox");
	private By forget = By.id("link-forgot");
	private By login = By.cssSelector(".btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg");
	private By reset = By.linkText("Enter your email address to reset your password");


	public TravelsLogin(WebDriver driver) {
		super(driver);

	}

	public WebElement getEmail() {
		return this.driver.findElement(email);
	}

	public WebElement getPassword() {
		return this.driver.findElement(password);
	}

	public WebElement getRemember() {
		return this.driver.findElement(remember);
	}

	public WebElement getForget() {
		return this.driver.findElement(forget);
	}

	public WebElement getLogin() {
		return this.driver.findElement(login);
	}
	public WebElement getReset() {
		return this.driver.findElement(reset);
	}


}
