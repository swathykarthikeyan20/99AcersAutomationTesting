package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.util.Assert;

import Pages.UpPageFactory;
import Up.Utils.BasicSteps;
import Up.Utils.ScreenShots;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpStepdefinition {
	
	public static WebDriver driver;
	UpPageFactory log;
	@Given("the user opens the web page")
	public void the_user_opens_the_web_page() {
		System.setProperty("webdrive.chrome.driver","C:\\Drivers\\chromedriver_win32 (4) (1))\\chromedriver.exe");
		 driver=new ChromeDriver();
	      driver.get("https://www.99acres.com/Home-Real-Estate.htm");
	      driver.manage().window().maximize();
	}
	
@When("the user clicks on the Up Project link")
public void the_user_clicks_on_the_up_project_link() throws InterruptedException, IOException {
	 log=new UpPageFactory(driver);
	 log.UpcomimgProject();
	 ScreenShots.CaptureScreen(driver, "UpComing project");
	 Thread.sleep(1000);
}

@And("the user scrolls down to the Floor Plan section")
public void the_user_scrolls_down_to_the_floor_plan_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	log.floorPlan();
	ScreenShots.CaptureScreen(driver, "FloorPlan");
	Thread.sleep(1000);
	
}

@And("check all the Functionality of FloorPlan Section")
public void check_all_the_functionality_of_FloorPlan_Section() throws InterruptedException, IOException {
	WebElement title = driver.findElement(By.id("selectedTab")); 
	title.click();
	String expectedClassAfterClick = "magicItems body_med magicLine__active pageComponent";  
	String actualClassAfterClick = title.getAttribute("class");  
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
	 
	  
	
}

@When("the user scrolls down to the Seller Section")
public void the_user_scrolls_down_to_the_seller_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	log.Seller();
	ScreenShots.CaptureScreen(driver, "SellerSection");
}



@Then("check all the Functionality of Seller Section")
public void check_all_the_functionality_of_seller_section() {
	
		WebElement title = driver.findElement(By.id("selectedTab")); 
		title.click();
		String expectedClassAfterClick = "magicItems body_med magicLine__active pageComponent";  
		String actualClassAfterClick = title.getAttribute("class"); 
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
		 
}

@When("the user scrolls down to the Facilities Section")
public void the_user_scrolls_down_to_the_facilities_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	log.Facilities();
	ScreenShots.CaptureScreen(driver, "Facilities");
	Thread.sleep(1000);
}

@Then("check all the Functionality of Facilities Section")
public void check_all_the_functionality_of_facilities_section() {
	WebElement title = driver.findElement(By.id("selectedTab")); 
		title.click();
		String expectedClassAfterClick = "magicItems body_med magicLine__active pageComponent";  
		String actualClassAfterClick = title.getAttribute("class");  
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
}


@When("the user scrolls down to the BrochureAndPriceList Section")
public void the_user_scrolls_down_to_the_brochure_and_price_list_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	log.BrochureAndPriceList();


}

@Then("will check all the functionality of BrochureAndPriceList Section")
public void will_check_all_the_functionality() {
	WebElement title = driver.findElement(By.id("selectedTab")); 	
		title.click();
String expectedClassAfterClick = "magicItems body_med magicLine__active pageComponent";  
		String actualClassAfterClick = title.getAttribute("class");  
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
}

@Then("the user scrolls down to the ExploreLocality Section")
public void the_user_scrolls_down_to_the_explore_locality_section() throws InterruptedException, IOException {
	
	log=new UpPageFactory(driver);
	log.ExploreLocality();
	
	
}

@When("the user scrolls down to the Builder  Section")
public void the_user_scrolls_down_to_the_builder_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	Thread.sleep(1000);
	ScreenShots.CaptureScreen(driver, "Builder_SEction");
	log.Builder();
	Thread.sleep(1000);
	
}
@Then("check all the functionality of Builder Section")
public void check_all_the_functionality_of_builder_section() {
	WebElement title = driver.findElement(By.id("selectedTab")); 
			
		String expectedClassAfterClick = "Builder";  
		String actualClassAfterClick = title.getText();  
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
}
@When("the user scrolls down to the FAQS Section")
public void the_user_scrolls_down_to_FAQS_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	ScreenShots.CaptureScreen(driver, "FAQS_Section");
	log.FAQS();
	Thread.sleep(1000);
	
}
@Then("check all the functionality of FAQS Section")
public void check_all_the_functionality_of_FAQS_section() {
	WebElement title = driver.findElement(By.id("selectedTab")); 
		title.click();
		String expectedClassAfterClick = "magicItems body_med magicLine__active pageComponent";  
		String actualClassAfterClick = title.getAttribute("class");  
	assertEquals(expectedClassAfterClick, actualClassAfterClick);
	
}



@When("the user scrolls down to the  Brochure Section")
public void the_user_scrolls_down_to_the_brochure_section() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	log.Brochure();
//	ScreenShots.CaptureScreen(driver, "BrochureSection");
//	Thread.sleep(1000);
}

@And("user click the Investment button")
public void user_click_the_investment_button() {
	log=new UpPageFactory(driver);
	log.Investment();
}

@And("user click the yes button")
public void user_click_the_yes_button() {
	log=new UpPageFactory(driver);
	log.Yes();
}

@And("user click the Month3")
public void user_click_the_month3() {
	log=new UpPageFactory(driver);
	log.Month3();
}

@And("user click the Site")
public void user_click_the_site() {
	log=new UpPageFactory(driver);
	log.Site();
}

@And("user click the Iagree")
public void user_click_the_iagree() {
	log=new UpPageFactory(driver);
	log.Iagree();
}

@And("the user needs to enter the name <{string}>")
public void the_user_needs_to_enter_the_name(String Name) {
	log=new UpPageFactory(driver);
	log.Name(Name);
}

@And("user click the IN91")
public void user_click_the_in91() {
	log=new UpPageFactory(driver);
	log.In91();
}

@And("the user needs to enter the PhoneNumber<{string}>")
public void the_user_needs_to_enter_the_phone_number(String PhoneNumber) {
	log=new UpPageFactory(driver);
	log.phoneNumber(PhoneNumber);
}
@And("the user needs to enter the EmailId<{string}>")
public void the_user_needs_to_enter_the_email_id(String EmailId) {
	log=new UpPageFactory(driver);
	log.EmailId(EmailId);
	
	
    
}

@And("user clicks the download")
public void user_clicks_the_download() throws InterruptedException, IOException {
	log=new UpPageFactory(driver);
	Thread.sleep(1000);
	ScreenShots.CaptureScreen(driver, "DownloadForm");
	log.download();
	Thread.sleep(1000);
}

@Then("user clicks the closeTab")
public void user_clicks_the_close_tab() {
	log=new UpPageFactory(driver);
	log.closetab();
	
	
}



@When("The user needs to click the Feedback button")
public void the_user_needs_to_click_the_feedback_button() throws InterruptedException {
	log=new UpPageFactory(driver);
	log.feedback();
}



@When("The user needs to is enter the <{string}>")
public void the_user_needs_to_is_enter_the(String  Email_Id) throws InterruptedException {
	log=new UpPageFactory(driver);
	log.feedbackEmail(Email_Id);
}

@When("the user needs to enter the feedback <{string}>")
public void the_user_needs_to_enter_the_feedback(String Feedback_details) throws InterruptedException {
	log=new UpPageFactory(driver);
	log.feedBack_Details(Feedback_details);
}




@When("the user needs to clicks on the Send button")
public void the_user_needs_to_clicks_on_the_send_button() throws InterruptedException {
	log=new UpPageFactory(driver);
	log.feedback_send();
}

@Then("the user needs to clicks on the Ok button")
public void the_user_needs_to_clicks_on_the_ok_button() throws InterruptedException {
	log=new UpPageFactory(driver);
	log.feedBack_Ok();
}





}