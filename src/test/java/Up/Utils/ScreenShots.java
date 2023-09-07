package Up.Utils;



import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	public static void CaptureScreen(WebDriver driver,String filename) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot)driver;
//	    what from it should take file
	    File file=ts.getScreenshotAs(OutputType.FILE);
//	    where should it store(./ in the current project-Screenshots is file name-image is ss name-png is typeof file)
	    FileUtils.copyFile(file, new File("./Screenshots/"+filename+".png"));
	    
		}
		
	}
	


