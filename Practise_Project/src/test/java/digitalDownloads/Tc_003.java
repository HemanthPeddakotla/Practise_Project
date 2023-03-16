package digitalDownloads;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import generic_utility.BaseUnit;
import pom_repo.DigitalDownloadPage;

public class Tc_003 extends BaseUnit{
	@Test(groups = "functionality")
	public void digi() {
		DigitalDownloadPage page = new DigitalDownloadPage(driver);
		page.getDigiDownloadsCategory().click();
		Select select = new Select(page.getViewDropDown());
		page.getViewDropDown().click();
	    List<WebElement> opt = select.getOptions();
	    for(WebElement optn : opt) {
		   System.out.println(optn.getText());
	   }
		
	}

}
