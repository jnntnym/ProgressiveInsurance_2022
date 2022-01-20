package progressive.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import progressive.qa.pages.ProductsPage;

public class BaseClass {

	public static WebDriver driver;
	public ProductsPage productsPage;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup(); // setup
		driver = new ChromeDriver(); // initialize
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Duration not working for me
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		initElements();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void browserQuit() {
		// driver.quit();

	}

	public void initElements() {
		productsPage = new ProductsPage(driver);
	}

}
