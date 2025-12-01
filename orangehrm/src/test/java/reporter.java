import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class reporter {

	public static ExtentReports extent;
	public static ExtentTest logger;
	
  @Test
  public void f() throws IOException {
  }
  @BeforeSuite
  public void beforeSuite() {
	  extent = new ExtentReports("C:\\Users\\Administrator\\Documents\\Selenium demo\\mvnorangehrm\\reports.html");
  }
  

  @AfterSuite
  public void afterSuite() {
	  extent.flush();
  }

}
