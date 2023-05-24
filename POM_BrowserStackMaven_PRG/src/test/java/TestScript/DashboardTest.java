package TestScript;

import org.testng.annotations.Test;

import BrowserStackPages.BrowserStackDashboardPage;
import BrowserStackPages.BrowserStackSigninPage;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DashboardTest 
{
	WebDriver driver;
	BrowserStackDashboardPage bsdp;
	BrowserStackSigninPage bssp;
  @Test(priority = 1)
  public void LoginTest() 
  {
	  bssp=new BrowserStackSigninPage(driver);
	  bssp.enterUserEmail("uddhavhivare@gmail.com");
	  bssp.enterUserPass("Uddhav@123");
	  bssp.ClickSubmitBtn();
  }
  @Test(priority = 2)
  public void DahsboradTest()
  {
	  bsdp=new BrowserStackDashboardPage(driver);
	  bsdp.UserProfileClick();
	  bsdp.clickOnSummary();
	  bsdp.VerifyUserName();
	  Assert.assertEquals(bsdp.VerifyUserName(),"Uddhav Shivaji Hivare");
  }
  @BeforeClass
  public void SetUp() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.browserstack.com/users/sign_in");
  }

  @AfterClass
  public void afterClass() 
  {
	driver.quit();
  }

}
