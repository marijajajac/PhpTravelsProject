package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {

	private By table = By.cssSelector("#content > div.panel.panel-default > div.panel-body tbody");
	private By upload = By.cssSelector("a[href=\"https://www.phptravels.net/admin/cars/gallery/chennai\"]");

	private List<WebElement> rows = driver.findElements(By.className("xcrud-row"));

	public TravelsCars(WebDriver driver) {
		super(driver);

	}

	public List<WebElement> carsList() {
		List<WebElement> cars = new ArrayList<WebElement>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement name = rows.get(i).findElements(By.tagName("td")).get(4);
			cars.add(name);
		}
		return cars;
	}

	public int getOrders() {
		int sum = 0;
		for (int i = 0; i < rows.size(); i++) {
			WebElement cell = rows.get(i).findElements(By.tagName("td")).get(9);
			WebElement input = cell.findElement(By.tagName("input"));
			String value = input.getAttribute("value");
			sum += Integer.parseInt(value);
		}
		return sum;
	}

	public WebElement addImage() {
		return this.driver.findElement(upload);
	}

}
