package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelCustomer extends BasicPage {
	private By accounts = By.cssSelector("a[href=\"#ACCOUNTS\"]");
	private By customers = By.cssSelector("a[href=\"https://www.phptravels.net/admin/accounts/customers/\"]");
	private By edit = By.cssSelector("a[href=\"https://www.phptravels.net/admin/accounts/customers/edit/390\"]");
	private By firstName = By.name("fname");
	private By lastName = By.name("lname");
	private By password = By.name("password");
	private By email = By.name("email");
	private By mobile = By.name("mobile");
	private By address1 = By.name("address1");
	private By status = By.name("status");
	private By checkbox = By.className("checkbox");
	private By country = By.cssSelector("#s2id_autogen1 > a > span.select2-chosen");
	private By address2 = By.name("address2");
	private By countryName = By.cssSelector("#select2-drop > div > input");
	private By submit = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By search = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > a");
    private By searchInput = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
    private By go = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/span/a");
    
	
	public TravelCustomer(WebDriver driver) {
		super(driver);

	}

	public WebElement getAccounts() {
		return this.driver.findElement(accounts);
	}

	public WebElement getPassword() {
		return this.driver.findElement(password);
	}

	public WebElement getCustomers() {
		return this.driver.findElement(customers);
	}

	public WebElement getEdit() {
		return this.driver.findElement(edit);
	}

	public WebElement getFirstName() {
		return this.driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return this.driver.findElement(lastName);
	}

	public WebElement getEmail() {
		return this.driver.findElement(email);
	}

	public WebElement getMobile() {
		return this.driver.findElement(mobile);
	}

	public WebElement getAddress1() {
		return this.driver.findElement(address1);
	}

	public WebElement getAddress2() {
		return this.driver.findElement(address2);
	}

	public WebElement getStatus() {
		return this.driver.findElement(status);
	}

	public WebElement getCheckbox() {
		return this.driver.findElement(checkbox);
	}

	public WebElement getCountry() {
		return this.driver.findElement(country);
	}

	public WebElement getCountryName() {
		return this.driver.findElement(countryName);
	}

	public WebElement getSubmit() {
		return this.driver.findElement(submit);
	}
	public WebElement getSearch() {
		return this.driver.findElement(search);
	}
	public WebElement getSearchInput() {
		return this.driver.findElement(searchInput);
	}
	public WebElement getGo() {
		return this.driver.findElement(go);
	}

	public void iframeClose() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("return document.querySelector(\"#chat-widget-container\").remove();");
            js.executeScript("return document.querySelector(\"#livechat-eye-catcher-img > img\").remove();");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Nema ga");
        }
    }
}
