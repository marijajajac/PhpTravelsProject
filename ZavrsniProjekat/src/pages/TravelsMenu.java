package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage {

	private By dashboard = By.cssSelector("a[href=\"https://www.phptravels.net/admin\"]");
	private By updates = By.cssSelector("a[href=\"https://www.phptravels.net/admin/updates/\"]");
	private By modules = By.cssSelector("a[href=\"https://www.phptravels.net/admin/settings/modules/\"]");
	private By tours = By.cssSelector("a[href=\"#Tours\"]");
	private By addNew = By.cssSelector("a[href=\"https://www.phptravels.net/admin/tours/add\"]");
	private By cars = By.cssSelector("a[href=\"#Cars\"]");
	private By cars2 = By.cssSelector("a[href=\"https://www.phptravels.net/admin/cars\"]");
	private By coupons = By.cssSelector("a[href=\"https://www.phptravels.net/admin/coupons/\"]");
	private By newsletter = By.cssSelector("a[href=\"https://www.phptravels.net/admin/newsletter/\"]");
	private By bookings = By.cssSelector("a[href=\"https://www.phptravels.net/admin/bookings/\"]");
	private By extras = By.cssSelector("a[href=\"https://www.phptravels.net/admin/cars/extras\"]");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By accounts = By.cssSelector("a[href=\"#ACCOUNTS\"]");

	public TravelsMenu(WebDriver driver) {
		super(driver);

	}

	public WebElement getDashboard() {
		return this.driver.findElement(dashboard);
	}

	public WebElement getUpdates() {
		return this.driver.findElement(updates);
	}

	public WebElement getModules() {
		return this.driver.findElement(modules);
	}

	public WebElement getTours() {
		return this.driver.findElement(tours);
	}

	public WebElement getAddNew() {
		return this.driver.findElement(addNew);
	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public WebElement getCars2() {
		return this.driver.findElement(cars2);
	}

	public WebElement getCoupons() {
		return this.driver.findElement(coupons);
	}

	public WebElement getNewsletter() {
		return this.driver.findElement(newsletter);
	}

	public WebElement getBookings() {
		return this.driver.findElement(bookings);
	}

	public WebElement getExtras() {
		return this.driver.findElement(extras);
	}

	public WebElement getAccounts() {
		return this.driver.findElement(accounts);
	}

	public WebElement getCustomers() {
		return this.driver.findElement(customers);
	}

}
