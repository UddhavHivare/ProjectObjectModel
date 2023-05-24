package BrowserStackPages;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackDashboardPage 
{
	//Object Repository
	WebDriver driver;
	By UserProfileBtn=By.xpath("//button[@id='account-menu-toggle']");
	By Summary=By.xpath("//a[text()='Summary']");
	By UserFullName=By.xpath("(//span[@class='profile-details-card__list-item-value-text'])[1]");
	
//	Page Factory
//	@FindBy(xpath = "//button[@id='account-menu-toggle']") 
//	WebElement USerProfileBtn;
//	@FindBy(xpath = "//a[text()='Summary']") 
//	WebElement Summary;
//	@FindBy(xpath= "(//span[@class='profile-details-card__list-item-value-text'])[1]")
//	WebElement UserFullName;
	//Counstructor
	public BrowserStackDashboardPage(WebDriver driver) 
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	//Methods
	public void UserProfileClick()
	{
		driver.findElement(UserProfileBtn).click();
//		Actions act=new Actions(driver);
//		act.moveToElement(USerProfileBtn).perform();
	}
	public void clickOnSummary()
	{
		driver.findElement(Summary).click();
		//Summary.click();
	}
	public String VerifyUserName()
	{
		String getUserText=driver.findElement(UserFullName).getText();
		return getUserText;
//		String getUserText=UserFullName.getText();
//		return getUserText;
		
	}
}
