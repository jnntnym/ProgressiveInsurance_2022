package progressive.qa.auto;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import progressive.qa.base.BaseClass;

public class AutoQuoteTest extends BaseClass {

	@Test
	public void autoQuoteTesting() {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(productsPage.autoClick));
		productsPage.autoClick.click();

		wait.until(ExpectedConditions.visibilityOf(productsPage.zipCodElement));
		String zipCode = productsPage.zipCodElement.getText();

		System.out.println("Zip code text displayed here--->" + zipCode);

	}

}
