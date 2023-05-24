package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSigninPage 
{
	//Object Repository
	WebDriver driver;
//	By UserEmail=By.xpath("//input[@id='user_email_login']");
//	By UserPass=By.xpath("//input[@id='user_password']");
//	By LoginBtn=By.xpath("//input[@id='user_submit']");
	
	//Page Factory
	@FindBy(xpath ="//input[@id='user_email_login']")
	WebElement UserEmail;
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement UserPass;
	@FindBy(xpath = "//input[@id='user_submit']") 
	WebElement LoginBtn;
	//Constructor
	public  BrowserStackSigninPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterUserEmail(String userEmail)
	{
		//driver.findElement(UserEmail).sendKeys(userEmail);
		UserEmail.sendKeys(userEmail);
	}
	public void enterUserPass(String userPass)
	{
		//driver.findElement(UserPass).sendKeys(userPass);
		UserPass.sendKeys(userPass);
	}
	public void ClickSubmitBtn()
	{
		//driver.findElement(LoginBtn).click();
		LoginBtn.click();
	}
}
