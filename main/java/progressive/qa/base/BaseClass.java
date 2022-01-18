package progressive.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.progressiveqa/drivers/chromedriver97");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver97");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");

	}

}
