package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class beCognizant extends BasePage {
	
	WebDriver driver;
	
	public beCognizant (WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="O365_HeaderRightRegion") 
	WebElement empID;
	@FindBy(id="mectrl_currentAccount_primary") 
	WebElement accDetail;
	@FindBy(xpath="//span[@class='fontSizeXLarge']") 
	WebElement aroundCog;
	@FindBy(id="news_text_title") 
	List<WebElement> nT;
	@FindBy(xpath="//*[@style='-webkit-line-clamp: 2;']")
	List<WebElement> newsTitle;
	@FindBy(xpath="//strong[normalize-space()='See all']")
	WebElement seeAll;
	
	
	
	public void clickId() throws InterruptedException {	
		Thread.sleep(10000);
		empID.click();
	}
	
	public String checkId() {
		String empName = accDetail.getText();	
		return empName;
	}
	
	public boolean checkAroundCog() throws InterruptedException {
		boolean availability = aroundCog.isDisplayed();
		return availability;
	}
	
	public void scrollToSeeAll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", seeAll);
	}
	
	public ArrayList<Boolean> toolTip() throws InterruptedException {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		for(int i=0; i<=5; i++) {
			WebElement ele = newsTitle.get(i);
			String extt = ele.getText();
			String tt = ele.getAttribute("title");
		    if(tt.equals(extt)) {
		    	list.add(true);
		    }else {
		    	list.add(false);
		    }
		}
		return list;
	}
	
	public int countNews() {
		
		int s = newsTitle.size();
		System.out.println(s);
		for(WebElement webElement : newsTitle) {
			String Title = webElement.getText();
			System.out.println(Title);
		}
		return s;	
	}
	
	public void clickSeeAll() {
		seeAll.click();
	}
	

}
