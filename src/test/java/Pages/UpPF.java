package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Up.Utils.BasicSteps;
import Up.Utils.ScreenShots;

public class UpPF {
	
	UpPageFactory log;
	WebDriver driver=null;

  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdrive.chrome.driver","C:\\Drivers\\chromedriver_win32 (4) (1))\\chromedriver.exe");
	  driver=new ChromeDriver();
	    driver.get("https://www.99acres.com/Home-Real-Estate.htm");
	driver.manage().window().maximize();
//	log=new UpPageFactory(driver);
	
	UpPageFactory log = new UpPageFactory(driver);
//	log.SetUp(driver,"https://www.99acres.com/Home-Real-Estate.htm");
	log.UpcomimgProject();
	
	log.floorPlan();
     log.Seller();
     log.Facilities();
    log.BrochureAndPriceList();

     log.Builder();
     log.FAQS();
     log.Brochure();
	log.Investment();
	log.Yes();
	log.Month3();
	log.Site();
	log.Iagree();
    log.Name("swathy");
	log.In91();
	log.phoneNumber("8072660406");
	log.EmailId("swathykarthikeyan20@gmail.com");
	log.download();
	log.closetab();

	
	log.ExploreLocality();
	log.feedback();
	log.feedbackEmail("swathy");
	log.feedBack_Details("This app is very must usefull to find a home ");
	log.feedback_send();
	log.feedBack_Ok();
	
 driver.quit();
  }
  

}
