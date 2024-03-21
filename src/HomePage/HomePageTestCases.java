package HomePage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import bsh.commands.dir;

public class HomePageTestCases extends Parameters {

	@BeforeTest()

	public void MySetup() {
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

	public void CheckTheDefultLanguage() {

		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		Myassert.assertEquals(ActualLanguage, ExpectedEnglishLanguage);

	}

	@Test(priority = 2)

	public void CheckTheDefultCurrency() {

		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']"))
				.getText();
		Myassert.assertEquals(ActualCurrency, ExpectedCurrency);

	}

	@Test(priority = 3)

	public void CheckTheContactNumber() {

		String ActualContactNumber = driver.findElement(By.tagName("strong")).getText();
		Myassert.assertEquals(ActualContactNumber, ExpectedContactNumber);

	}

	@Test(priority = 4)

	public void VerifyQatafLogoIsDisplay() {

		WebElement QatafLogo = driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']//*[name()='svg']"));
		boolean actualResult = QatafLogo.isDisplayed();
		Myassert.assertEquals(actualResult, true);

	}

	@Test(priority = 5)

	public void CheckTheHotelTapIsNotSelected() {

		WebElement HotelTap = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));

		String ActualResult = HotelTap.getAttribute("aria-selected");

		Myassert.assertEquals(ActualResult, "false");
	}

	@Test(priority = 6)
	public void CheckFlightDepartureDate() {

		String ActualDepartureDate = driver
				.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-cPuPxo LiroG']"))
				.getText();
		int ActualDepartureDateAsNumber = Integer.parseInt(ActualDepartureDate);

		Myassert.assertEquals(ActualDepartureDateAsNumber, Tomorrow);

	}

	@Test(priority = 7 )
	public void CheckFlightReturnDate() {

		String ActualReturnDate = driver
				.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-OxbzP edzUwL'] span[class='sc-cPuPxo LiroG']"))
				.getText();
		int ActualReturnDateAsNumber = Integer.parseInt(ActualReturnDate);

		Myassert.assertEquals(ActualReturnDateAsNumber, TheDayAfterTomorrow);

	}
			@Test(priority = 8 )
			public void UseRandomMethodToChangeLanguag() {
				
			driver.get(Websites[randomWebsites]);
				if(driver.getCurrentUrl().contains("en")) {
					
					String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
					Myassert.assertEquals(ActualLanguage, ExpectedEnglishLanguage);
					
				}
				else {
					
					String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
					Myassert.assertEquals(ActualLanguage, ExpectedArabicLanguage);
					
				}
				
			}
}
