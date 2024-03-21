package HotelSearchTest;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.almosafer.com/en";
	Assertion Myassert = new Assertion();
	Random rand = new Random();
	String[] EnglishCities = { "Dubai", "Jeddah", "Riyadh" };
	String[] ArabicCities = { "جده", "دبي" };
	int randomEnglishCities = rand.nextInt(EnglishCities.length);
	int randomArabicCities = rand.nextInt(ArabicCities.length);

	int RandomVisitorSelect = rand.nextInt(2);
}
