package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".new-survey-btn.btn.btn-primary") 
	private WebElement newSurveyButton;
	
	@FindBy(how = How.CSS, using = ".large") 
	private WebElement newSurveyTextbox;
	
	@FindBy(how = How.CSS, using = ".btn.btn-primary.btn-loader") 
	private WebElement createSurveyButton;
	
	
	
	public void clickNewSurveyButton(){
		newSurveyButton.click();
	}
	
	public void enterSurveyName(String surveyName){
		newSurveyTextbox.sendKeys(surveyName);
	}
	
	public void clickCreateSurveyButton(){
		createSurveyButton.click();
	}
	
}
