package Pages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Up.Utils.BasicSteps;
import Up.Utils.ScreenShots;
import io.opentelemetry.api.internal.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UpPageFactory {
    
    WebDriver driver=null;
    Excelsheet excelsheet;
  
   
    @FindBy(xpath="//*[@id=\"elem_img\"]")
    WebElement UpProject;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/button")
     WebElement okGotItButton;
    @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[1]")
    WebElement floorPlan;
    @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[2]")
    WebElement Seller;
   @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[3]")
    WebElement Facilities ;
   @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[4]")
   WebElement BrochureAndPriceList;
   @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[5]")
   WebElement ExploreLocality;
    @FindBy(xpath="//*[@id=\"floorPlans\"]/div[3]/div/div/div/div/div[2]/span[2]")
    WebElement BHK3;
    @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[6]")
    WebElement Builder;
    @FindBy(xpath="//*[@id=\"floorPlans\"]/div[3]/div/div/div/div/div[3]/span[2]")
    WebElement BHK4;
    @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[7]")
    WebElement FAQS;
    @FindBy(xpath="//*[@id=\"floorPlans\"]/div[1]/div/a/em")
//    WebElement viewHomes3d;
//    @FindBy(xpath="//*[@id=\"magicLineTabsParent\"]/a[8]")
    WebElement Articles;
    @FindBy(xpath="//*[@id=\"xidPageMenu\"]/div/div[4]/div[1]/button/span/span")
    WebElement  Brochure;
    @FindBy(xpath="//*[@id=\"xidPageMenu\"]/div/div[4]/div[2]/button/span")
    WebElement ViewNumber;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[1]/div[2]/div/div/div[1]/label/span")
    WebElement Investment;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[1]/div[3]/div/div[1]/label/span")
    WebElement Yes;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[2]/div[2]/div/div[1]/label/span")
    WebElement Month3;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[2]/div[4]/div/div/label/span")
    WebElement Site;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[2]/div[5]/div/div/label/span[1]")
    WebElement Iagree;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[1]/div[4]/div[1]/div[1]/input")
    WebElement Name;
    @FindBy(xpath="//*[@id=\"eoiSelectcc\"]/div/select/option[1]")
    WebElement In91;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[1]/div[4]/div[2]/div[1]/div[1]/input")
    WebElement PhoneNumber;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[1]/div[4]/div[3]/div[1]/input")
    WebElement EmailId;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/form/div[2]/div[6]/input")
    WebElement download;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/i")
    WebElement closetab;
    @FindBy(xpath="//*[@id=\"menu_g2c\"]")
    WebElement menu;
    @FindBy(xpath="//*[@id=\"menu_header\"]/li/a")
    WebElement searchproperty;
    @FindBy(xpath="//*[@id=\"dk_container_bedrooms\"]/a")
    WebElement BEDROOM;
    @FindBy(xpath="//*[@id=\"dk_container_bedrooms\"]/a")
    WebElement BHK2B;
    @FindBy(xpath="//*[@id=\"dk_container_direction\"]/a")
    WebElement DIRECTION;
    @FindBy(xpath="//*[@id=\"dk_container_direction\"]/a")
    WebElement North;
    @FindBy(xpath="//*[@id=\"dk_container_floor\"]/a")
    WebElement FLOOR;
    @FindBy(xpath="//*[@id=\"dk_container_floor\"]/a")
    WebElement Floor_5;
    @FindBy(xpath="//*[@id=\"dk_container_min_area\"]/a")
    WebElement MINAREA;
    @FindBy(xpath="//*[@id=\"dk_container_min_area\"]/a")
    WebElement sq_ft;
    @FindBy(xpath="//*[@id=\"dk_container_max_area\"]/a")
    WebElement MAXAREA;
    @FindBy(xpath="//*[@id=\"dk_container_max_area\"]/a/span")
    WebElement Max_sq_ft;
    @FindBy(xpath="//*[@id=\"locality-reviews\"]/div[7]/div[2]/button")
    WebElement review;
    @FindBy(id="autoInput")
    WebElement Inputvalue;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/div/span")
    WebElement InputOption;
    @FindBy(xpath="//*[@id=\"Tenant\"]")
    WebElement Tenant;
    @FindBy(xpath="//*[@id=\"[object Object]\"]")
    WebElement Year;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div/div[7]/button/span")
    WebElement Proceed_review;
    @FindBy(css = "svg.Starrating__starSvg")
    WebElement Connectivity_Commute;
    @FindBy(xpath="//*[@id=\"question_2\"]/div[2]/fieldset")
    WebElement Lifestyle_facilities; 
    @FindBy(xpath = "//*[@id=\"question_3\"]/div[2]/fieldset")
    WebElement Safety_Security;
    @FindBy(xpath= "//*[@id=\"question_4\"]/div[2]/fieldset")
    WebElement Environment;
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/div[1]/div[3]/textarea")
    WebElement like_about_locality;
    @FindBy(xpath="//*[@id=\"NEGATIVE_TEXT_ID\"]")
    WebElement dislike_about_locality;
    @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div[1]/div[2]/div[1]/div/span[2]")
    WebElement Good_Public_Transport;
   @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/button/span")
   WebElement post_Review;
   @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[3]/div[1]/input")
   WebElement Name_review_post;
   	@FindBy(xpath="//*[@id=\"email\"]")
   	WebElement Email_Review_post;
   	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[2]/button")
   	WebElement post_Review2;
   	@FindBy(xpath="//*[@id=\"side_widget_wrapper\"]/div")
   	WebElement feedback;
   	@FindBy(xpath="//*[@id=\"side_widget_wrapper\"]/div/div[2]/div[2]/form/div[2]/div[1]/input")
   	WebElement feedBack_Email;
   	@FindBy(xpath="//*[@id=\"side_widget_wrapper\"]/div/div[2]/div[2]/form/div[3]/div[1]/textarea")
   	WebElement feedBack_details;
   	@FindBy(xpath="//*[@id=\"side_widget_wrapper\"]/div/div[2]/div[2]/form/div[4]/span/input")
   	WebElement feedBack_send;
   	@FindBy(xpath="//*[@id=\"side_widget_wrapper\"]/div/div/div[2]/a")
   	WebElement feedBack_Ok;
   	
    public UpPageFactory(WebDriver driver) {
        this.driver = driver;
        this.excelsheet = new Excelsheet("C:\\Users\\SWAKARTH\\Documents\\Acers99SprintProject\\acres\\Screenshots\\login.xlsx");
        
        PageFactory.initElements(driver, this);
        
    }
    
    public void UpcomimgProject() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");
            Thread.sleep(2000);
            ScreenShots.CaptureScreen(driver, "log1");
            UpProject.click();
            Thread.sleep(1000);
           js.executeScript("window.scrollBy(0,500)");
    }
    public void floorPlan() throws InterruptedException, IOException {
    	String parentWindowHandle = driver.getWindowHandle();
    Set<String> windowHandles = driver.getWindowHandles();
    for (String handle : windowHandles) {
        driver.switchTo().window(handle);
        if (!handle.equals(parentWindowHandle)) {
        	   ScreenShots.CaptureScreen(driver, "swathy");
        	Actions act=new Actions(driver);
            
         act.moveToElement(okGotItButton).click().build().perform();
            break;
        }  
    }
   	
    JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,1000)");
    Thread.sleep(2000);
    floorPlan.click();
    ScreenShots.CaptureScreen(driver, "log2");

    
    Thread.sleep(1000);
    BHK3.click();  
    Thread.sleep(1000);
    BHK4.click();
    Thread.sleep(1000);

    }
  
    public void Seller() throws InterruptedException, IOException {
 Seller.click();
        ScreenShots.CaptureScreen(driver, "log2");
        Thread.sleep(1000); 
    }
    public void Facilities() throws InterruptedException, IOException {
    	  Facilities.click();
    	   ScreenShots.CaptureScreen(driver, "log2");
    	    Thread.sleep(1000);
    }
    public void BrochureAndPriceList() throws InterruptedException, IOException {
        BrochureAndPriceList.click();
        ScreenShots.CaptureScreen(driver, "log3");
        Thread.sleep(1000);
    }
    public void Builder() throws InterruptedException, IOException {
    	ScreenShots.CaptureScreen(driver, "log5");
    	Builder.click();
        Thread.sleep(1000); 
    }
    public void FAQS() throws InterruptedException, IOException {
    	 FAQS.click();
    	   ScreenShots.CaptureScreen(driver, "log6");
    	 Thread.sleep(1000);
    }
    public void Articles() throws InterruptedException, IOException {
    	Articles.click();
    	   ScreenShots.CaptureScreen(driver, "log7");
        Thread.sleep(1000);
    }
    public void Brochure() throws InterruptedException, IOException {
    	Brochure.click();
    	   ScreenShots.CaptureScreen(driver, "log8");
    	Thread.sleep(1000);
    }

       public void Investment() {
    		Investment.click();
    	}
    	public void Yes() {
    		Yes.click();
    	}
    	public void  Month3() {
    		Month3.click();
    	}
    	public void Site() {
    		Site.click();   
    	}
    	public void Iagree() {
    		Iagree.click();
    	}
    	public void Name(String a) {
    		Name.click();
    		Name.sendKeys("swathy");  
    	}
    	public void In91() {
    		In91.click();
    	}
    	public void  phoneNumber(String s) {
    		PhoneNumber.click();   	
        	PhoneNumber.sendKeys("8072660406");
    	}
    	public void EmailId(String s) {
    		EmailId.click();
        	EmailId.sendKeys("swathykarthikeyan20@gmail.com");
        	
    	}
    	public void download() throws InterruptedException {
    		download.click();
    		Thread.sleep(1000);
    	}
    	public void closetab() { 
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		
    		closetab.click();
    	}

    	public void feedback() throws InterruptedException {
    	Actions act=new Actions(driver);
    		Thread.sleep(1000);
    		act.moveToElement(feedback).click().build().perform();
    	}
    	public void feedbackEmail(String s) throws InterruptedException {
    		Thread.sleep(1000);
    		feedBack_Email.sendKeys("swathy");
    	}
    	public void feedBack_Details(String S) throws InterruptedException {
    		Thread.sleep(1000);
    		feedBack_details.sendKeys("This app help me to find good home ");
    	}
    	public void feedback_send() throws InterruptedException {
    		Thread.sleep(1000);
    		feedBack_send.click();
    	}
    	public void feedBack_Ok() throws InterruptedException {
    		Thread.sleep(1000);
    		feedBack_Ok.click();
    	}
    	public void ExploreLocality() throws InterruptedException, IOException {
            ExploreLocality.click();
            ScreenShots.CaptureScreen(driver, "log4");
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1500)");
            review.click();
            String parentWindowHandle = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();

            for (String handle : windowHandles) {
                if (!handle.equals(parentWindowHandle)) {
                    driver.switchTo().window(handle);
                    
                   
                    String childWindowHandle = driver.getWindowHandle();
                    Set<String> childWindowHandles = driver.getWindowHandles();

                    for (String childHandle : childWindowHandles) {
                        if (!childHandle.equals(parentWindowHandle) && !childHandle.equals(childWindowHandle)) {
                            driver.switchTo().window(childHandle);
                            Inputvalue.click();
                            // Perform actions in the grandchild window, such as sending input
                            Actions act=new Actions(driver);
                            
                            act.moveToElement(Inputvalue).sendKeys("Yercaud, Salem").build().perform();
                            Thread.sleep(1000);
                            act.moveToElement(InputOption).click().build().perform();
                            js.executeScript("window.scrollBy(0,500)");
                            Thread.sleep(1000);
                            act.moveToElement(Tenant).click().build().perform();
                            Thread.sleep(1000);
                            js.executeScript("window.scrollBy(0,100)");
                            act.moveToElement(Year).click().build().perform();
                            Thread.sleep(1000);
                            ScreenShots.CaptureScreen(driver, "ReviewFrom_1");
                            js.executeScript("window.scrollBy(0,100)");
                            Thread.sleep(1000);
                            act.moveToElement(Proceed_review).click().build().perform();
                            Thread.sleep(1000);
                           act.moveToElement(Connectivity_Commute).click().build().perform();
                           Thread.sleep(1000);
                           act.moveToElement(Lifestyle_facilities).click().build().perform();
                           Thread.sleep(1000);
                           act.moveToElement(Safety_Security).click().build().perform();
//                           Thread.sleep(1000);
                           act.moveToElement(Environment).click().build().perform();
                           ScreenShots.CaptureScreen(driver, "ReviewFrom_2");
                      	like_about_locality.click();
                       	like_about_locality.sendKeys("It is really good house I ever buy.The  App usefull to get this home.All type facility are  available upto my mark ");
                       	Good_Public_Transport.click();
                      	dislike_about_locality.click();
                       	dislike_about_locality.sendKeys("No dislike about my property it is really nice I recommend others to find they home with the help 99acres");
                       	post_Review.click();
                       	Thread.sleep(1000);
                    	Name_review_post.click();
                    	Excelsheet excelSheet = new Excelsheet("C:\\Users\\SWAKARTH\\Documents\\Acers99SprintProject\\acres\\Screenshots\\login.xlsx");
                        try {
                            String[] values = excelSheet.getValues();
                            String Name_review_posts = values[0];
                            String Emailid = values[1];
                          
                            
                    	Name_review_post.sendKeys(Name_review_posts);
                    	Email_Review_post.click();
                    	Email_Review_post.sendKeys(Emailid);
                    	Thread.sleep(2000);
                       	ScreenShots.CaptureScreen(driver, "Submit_ReviewFrom");
                    	post_Review2.click();
                    	Thread.sleep(1000);
                    	ScreenShots.CaptureScreen(driver, "ReviewFrom_4");
                        } catch (IOException e) {
                        e.printStackTrace();
                    }
                            break; 
                        }
                    }                   
                   driver.switchTo().window(parentWindowHandle);
                    
                    break; 
                }
            }
        }
        
}



