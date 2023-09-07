package Repository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtendsTest {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void setUp() {
        extent = new ExtentReports();
        extent.attachReporter(new ExtentHtmlReporter("C:\\Users\\SWAKARTH\\Documents\\Acers99SprintProject\\acres\\Screenshots\\acres99Report.html")); 
        System.setProperty("webdrive.chrome.driver","C:\\Drivers\\chromedriver_win32 (4) (1))\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyTitle() {
        test = extent.createTest("verifyTitle");
        driver.get("https://www.99acres.com/Home-Real-Estate.htm");
        test.log(Status.INFO, "Browser started");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();

        if (url.contains("https://www.99acres.com/Home-Real-Estate.htm")) {
            test.log(Status.PASS, "Title verified");
        } else {
            test.log(Status.FAIL, "Title verification failed");
        }
        
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        
        driver.quit();
        extent.flush();
    }

}
