package pom_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPasswordTxtBox() {
		return passwordTxtBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	@FindBy(id = "Email")
	private WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTxtBox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
}
