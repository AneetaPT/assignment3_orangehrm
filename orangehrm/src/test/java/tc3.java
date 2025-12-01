import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class tc3 extends reporter{
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  logger = extent.startTest("Test3");
	  System.out.println("Test 3 is running");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
WebElement login ;

login =wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5"))));
	  String act =login.getText();
	  String exp="Loggin";
	if(act.equals(exp))
	{
		logger.log(LogStatus.PASS," the test 3 passes");
		assertTrue(true);
	}
	else {
//		File ss=a.getScreenshotAs(OutputType.FILE);
//		File ssdest = new File("C:\\Users\\Administrator\\Documents\\Selenium demo\\mavenorangehrm\\screenshots\\tc1.jpeg");
//	
		
		File srcFile;
		srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("C:\\Users\\Administrator\\Documents\\Testresults\\tc3.jpeg"));
			logger.log(LogStatus.FAIL," the test 1 failed");
			assertTrue(false);
		
		
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new EdgeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
