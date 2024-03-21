package HotelSearchTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingHotelTestCases extends Parameters {

	@BeforeTest

	public void Mysetup() {

		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement BobMSG = driver.findElement(By.cssSelector(".sc-iBmynh.izXFRL"));
		if (BobMSG.isDisplayed()) {

			WebElement SARButton = driver
					.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
			SARButton.click();

		}
	}

	@Test(priority = 1)
	public void RandomlySelectCitys() {

		WebElement HotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		HotelTap.click();
		WebElement SearchCityInput = driver.findElement(By.xpath("//input[@data-testid='AutoCompleteInput']"));

		if (driver.getCurrentUrl().contains("en")) {

			SearchCityInput.sendKeys(EnglishCities[randomEnglishCities]);
			WebElement ResultsList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));
			ResultsList.findElements(By.tagName("li")).get(1).click();
		} else {
			SearchCityInput.sendKeys(ArabicCities[randomArabicCities]);
			WebElement ResultsList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));
			ResultsList.findElements(By.tagName("li")).get(1).click();

		}

	}

	@Test(priority = 2)
	public void RandomlySelectNumberOfVisitor() {
		WebElement selectVisitor = driver
				.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));
		Select selector = new Select(selectVisitor);
		selector.selectByIndex(RandomVisitorSelect);
		WebElement SearchHotelButton = driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));
		SearchHotelButton.click();

	}

}
