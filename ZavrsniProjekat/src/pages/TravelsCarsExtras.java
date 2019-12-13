package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCarsExtras extends BasicPage {
	
	private By cars = By.cssSelector("a[href=\"#Cars\"]");
	private By add = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]");
	private By extras = By.cssSelector("a[href=\"https://www.phptravels.net/admin/cars/extras\"]");
	private By name = By.name("cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--");
	private By status = By.name("cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-");
	private By price = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input");
	private By uploadInput = By.cssSelector("input[type=\"file\"]");
	private By imageUploadedSuccessfuly = By.id("fileupload_completedMessage");
	private By save = By.cssSelector("a.btn.btn-primary.xcrud-action");
	private By rows = By.cssSelector("td:nth-child(4)");
	private By remove = By.className("a.xcrud-remove-file.btn.btn-danger");

	public TravelsCarsExtras(WebDriver driver) {
		super(driver);

	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public WebElement getExtras() {
		return this.driver.findElement(extras);
	}

	public WebElement getAdd() {
		return this.driver.findElement(add);
	}

	public WebElement getName() {
		return this.driver.findElement(name);
	}

	public WebElement getStatus() {
		return this.driver.findElement(status);
	}

	public WebElement getPrice() {
		return this.driver.findElement(price);
	}

	public WebElement getUploadInput() {
		return this.driver.findElement(uploadInput);
	}

	public void uploadImage(String path) {
		getUploadInput().sendKeys(new File(path).getAbsolutePath());
	}

	public boolean isImageUploadedSuccessfuly() {
		try {
			return this.driver.findElement(imageUploadedSuccessfuly) != null;
		} catch (Exception e) {
			return false;
		}
	}

	public WebElement getRow() {
		return this.driver.findElement(rows);
	}

	public WebElement getRemove() {
		return this.driver.findElement(remove);
	}

	public WebElement getSave() {
		return this.driver.findElement(save);
	}

}
