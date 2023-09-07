package Up.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicSteps {
	
	public static WebDriver driver;
	
	public static ChromeOptions options;
  public  WebDriver Chromedriver() {
//	  write the 4  steps in this lines 
	  
  System.setProperty("webdrive.chrome.driver","C:\\Drivers\\chromedriver_win32 (4) (1))\\chromedriver.exe");
    driver=new ChromeDriver();
   
	    options=new ChromeOptions();
	    options.addArguments("--start-maximized");
	    options.addArguments("--disable-popups-blocking");
	    options.addArguments("--disable=notifications");
	    driver.get("https://www.99acres.com/Home-Real-Estate.htm");
//	driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  return driver;
  }
  
  public static void Teardown() {
	  driver.close();
  }
  
//  @Beforetest
  
  
  
  
}
