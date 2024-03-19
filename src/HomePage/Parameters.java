package HomePage;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	
	WebDriver driver = new ChromeDriver();
	
	String URL = "https://www.almosafer.com/en";
	Assertion Myassert = new Assertion();
	String ExpectedLanguage = "en";
	String ExpectedCurrency = "SAR";
	String ExpectedContactNumber = "+966554400000";
	Boolean ExpectedLogo = true;
	Boolean ExpectedSelected = true ; 
	LocalDate Today = LocalDate.now();
	int Tomorrow = Today.plusDays(1).getDayOfMonth();
	int TheDayAfterTomorrow = Today.plusDays(2).getDayOfMonth();

}
