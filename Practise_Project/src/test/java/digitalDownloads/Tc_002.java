package digitalDownloads;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_utility.BaseUnit;
import pom_repo.DigitalDownloadPage;

public class Tc_002 extends BaseUnit{
	@Test
	public void dig() {
		DigitalDownloadPage page = new DigitalDownloadPage(driver);
		page.getDigiDownloadsCategory().click();
		page.getSortByDropDown().click();
		Select select = new Select(page.getSortByDropDown());
		List<WebElement> menu = select.getOptions();
		for(WebElement ele : menu) {
			System.out.println(ele.getText());
		}
	}
}
