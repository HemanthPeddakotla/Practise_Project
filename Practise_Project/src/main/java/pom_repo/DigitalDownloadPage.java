package pom_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {
	public   DigitalDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private  WebElement DigiDownloadsCategory;
	
	public WebElement getDigiDownloadsCategory() {
		return DigiDownloadsCategory;
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;
	
	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	public WebElement getDisplayDropDown() {
		return displayDropDown;
	}

	public WebElement getViewDropDown() {
		return viewDropDown;
	}

	@FindBy(id = "products-pagesize")
	private WebElement displayDropDown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewDropDown;
	
	

}
