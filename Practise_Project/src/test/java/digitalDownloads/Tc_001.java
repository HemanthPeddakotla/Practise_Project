package digitalDownloads;

import org.testng.annotations.Test;

import generic_utility.BaseUnit;
import pom_repo.DigitalDownloadPage;

public class Tc_001 extends BaseUnit{
	@Test(groups = "functionality")
	public void digiPage() {
		DigitalDownloadPage page = new DigitalDownloadPage(driver);
		page.getDigiDownloadsCategory().click();
		
	}
}
