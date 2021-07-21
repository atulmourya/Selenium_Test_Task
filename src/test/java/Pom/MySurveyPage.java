package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class MySurveyPage {

	
	public MySurveyPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".add-question-intro-btn") 
	private WebElement addQuestionButton;
	
	@FindBy(how = How.CSS, using = "div[id='basic'] li:nth-child(5) a:nth-child(1)") 
	private WebElement questionSingleRowText;
	
	@FindBy(how = How.CSS, using = ".alert-message-text.alert-success") 
	private WebElement alertMessage;
	
	@FindBy(how = How.CSS, using = "#inline-editor-id-2") 
	private WebElement questionTextBox;
	
	@FindBy(how = How.CSS, using = "div[class=\"btn-group dropdown\"]") 
	private WebElement threeDotMenu;
	
	@FindBy(how = How.CSS, using = "div[id='section-div-1'] li:nth-child(5) a:nth-child(1)") 
	private WebElement deleteOption;
	
	@FindBy(how = How.CSS, using = ".qp-btn.qp-primary-btn") 
	private WebElement deleteQuestionsButton;
	
	
	
	public void clickAddQuestionButton(){
		addQuestionButton.click();
	}
	
	public void clickSingleRowTextQuestion(){
		questionSingleRowText.click();
	}
	
	public void alertMessageVerify(String alertMessageText){
		Assert.assertEquals(alertMessageText, alertMessage.getText());	
	}
	
	public void enterQuestionText(String questionText){
		questionTextBox.clear();
		questionTextBox.sendKeys(questionText);
	}
	
	public void clickThreeDot(){
		threeDotMenu.click();
	}
	
	public void clickOnDeleteOption(){
		deleteOption.click();
	}
	
	public void clickOnDeleteQuestionButton(){
		deleteQuestionsButton.click();
	}
}
