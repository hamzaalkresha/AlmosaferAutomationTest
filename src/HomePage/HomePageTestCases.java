package HomePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageTestCases extends Parameters {

	@BeforeTest()

	public void MySetup() {
		driver.manage().window().maximize();
		driver.get(URL);
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
		Myassert.assertEquals(ActualLanguage, ExpectedLanguage);

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
					
//	@Test(priority = 4)
//
//	public void VerifyQatafLogoIsDisplay(){
//		
//		Boolean ActualLogo = driver.findElement(By.cssSelector(".sc-fihHvN.eYrDjb")).isDisplayed();
//		Myassert.assertEquals(ActualLogo , ExpectedLogo);
//		
//		
//	}
//	

	}




