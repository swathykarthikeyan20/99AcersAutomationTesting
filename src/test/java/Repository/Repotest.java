package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repotest {
  @Test
  public void testobj() throws IOException, InterruptedException {

	  File src = new File("C:\\Users\\SWAKARTH\\Documents\\Acers99SprintProject\\acres\\src\\test\\java\\Repository\\extendsProperties");

	  FileInputStream fis=new FileInputStream(src);
	  Properties pro= new Properties();
	  pro.load(fis);
	  System.out.println("Property file loaded");
	  WebDriverManager.chromedriver().setup();

      WebDriver driver = new ChromeDriver();

      driver.get("https://www.99acres.com/Home-Real-Estate.htm");

      driver.manage().window().maximize();

  
  }
}
