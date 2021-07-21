package stepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.BrowserManager; 
import Pom.HomePage;
import Pom.LoginPage;
import Pom.MySurveyPage;

public class Steps {
	
	
	String url = "https://www.questionpro.com/a/showLogin.do";
	WebDriver  driver = BrowserManager.getDriver("chrome",url);
	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	MySurveyPage mySurveyPage = new MySurveyPage(driver);
	
	@Given("Navigate to survey site")
	public void navigate_to_survey_site() {
	}

	@When("Login using credentials email = {string} and password = {string}")
	public void login_using_credentials_email_and_password(String email, String password) {
		loginPage.enterCredentials(email, password);
		loginPage.clickLogin();
	}
	
	@Given("Click on new survey button")
	public void click_on_new_survey_button() {
		homePage.clickNewSurveyButton();
	}

	@Given("Enter Survey name {string} and create survey")
	public void enter_survey_name_and_create_survey(String surveyName) {
		 homePage.enterSurveyName(surveyName);
		 homePage.clickCreateSurveyButton();
	}
	
	@When("Click Add questions button")
	public void click_add_questions_button() {
		mySurveyPage.clickAddQuestionButton();
	}

	@When("Click to Select Question")
	public void click_select_single_row_text_question() {
		mySurveyPage.clickSingleRowTextQuestion();
	}

	@Then("Verify Question added successfully")
	public void verify_question_added_successfully() {
		String alertMessageText = "Question added successfully  ";
	    mySurveyPage.alertMessageVerify(alertMessageText);
	}
	
	@Then("Add questions text {string}")
	public void add_questions_text(String questionText) {
		 mySurveyPage.enterQuestionText(questionText); 
	}
	
	@Then("Click three dot menu")
	public void click_three_dot_menu() {
	    mySurveyPage.clickThreeDot();
	}

	@Then("Click delete option")
	public void click_delete_option() {
	 mySurveyPage.clickOnDeleteOption();
	}

	@Then("Click on delete question button")
	public void click_on_delete_question_button() {
	   mySurveyPage.clickOnDeleteQuestionButton();
	}

	@Then("Verify Question deleted successfully")
	public void verify_question_deleted_successfully() throws InterruptedException {
		String alertMessageText = "Question deleted successfully  "; 
		Thread.sleep(2000); //Use wait because Text taking time to getting change/update for delete action
	    mySurveyPage.alertMessageVerify(alertMessageText);
    }
	
	@Then("Close browser")
	public void close_browser() {
	   driver.close();
	}
	
}
