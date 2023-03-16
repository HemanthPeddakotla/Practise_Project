package generic_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom_repo.LoginPage;

public class BaseUnit {
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	
	@Parameters("browserName")
	@BeforeMethod(groups = "launch")
	//To launch the browser
	public void launch(@Optional("chrome")String bName) throws Exception {
		String url = ReadData.fromProperty("Url");
		
		 if(bName.equalsIgnoreCase("chrome")) {
			//System.setProperty(chromeKey, chromeValue);
			 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		} 
		 else if(bName.equalsIgnoreCase("firefox")) {
			// System.setProperty(firefoxKey, firefoxValue);
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);	
	}
	
	@BeforeMethod(groups = "login", dependsOnGroups = "launch")
	public void login() throws Exception {
		String email = ReadData.fromProperty("Email");
		String pwd = ReadData.fromProperty("Password");
		LoginPage login = new LoginPage(driver);
		login.getLoginLink().click();
		login.getEmailTxtBox().sendKeys(email);
		login.getPasswordTxtBox().sendKeys(pwd);
		login.getLoginButton().click();
	}
	
	@AfterMethod()
	public void logout() {
		LoginPage logout = new LoginPage(driver);
		logout.getLogoutLink().click();
	}
	
	@AfterMethod(groups = "browserQuit", dependsOnGroups = "logout")
	public void quit() {
		driver.quit();
	}
	
}
