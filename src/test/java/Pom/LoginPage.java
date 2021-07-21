package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "username") 
	private WebElement emailTextbox;
	
	@FindBy(how = How.NAME, using = "password") 
	private WebElement passwordTextbox;
	
	@FindBy(how = How.CSS, using = ".main-login-btn") 
	private WebElement loginButton;
	
	public void enterCredentials(String email, String password){
		emailTextbox.sendKeys(email);
		passwordTextbox.sendKeys(password);
	}
	
	public void clickLogin(){
		loginButton.click();
	}
}
