package pom_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getLastNameTxtBox() {
		return lastNameTxtBox;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPwdTxtbox() {
		return pwdTxtbox;
	}

	public WebElement getConfirmPwdTxtBox() {
		return confirmPwdTxtBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTxtBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTxtBox;
	
	@FindBy(id = "Email")
	private WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	private WebElement pwdTxtbox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPwdTxtBox;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
}
