package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aroundCognizantNews extends BasePage {
	
	WebDriver driver;
	
	public aroundCognizantNews (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@style='-webkit-line-clamp: 2;']")
	List<WebElement> allNews;
	@FindBy(id="news_text_title") 
	List<WebElement> nT;
	@FindBy(id="title_text") 
	WebElement title;
	@FindBy(xpath="//div[@id='fa45f946-463e-428f-a84b-0bbbde09c3ba']/div")
	WebElement article;
	@FindBy(xpath="//strong[normalize-space()='See all']")
	WebElement seeAll;
	@FindBy(xpath="//*[@style='-webkit-line-clamp: 2;']")
	List<WebElement> newsTitle;
	
	public boolean compare_Title() {
		
		boolean contains = allNews.containsAll(newsTitle);
		return contains;
	}
	
	public List<String> newsArtiles() {
		List<String> details = new ArrayList<String>();
		for(int i=0; i<=4; i++) {
		WebElement wt = nT.get(i);
//		String st = wt.getText();
		wt.click();
//		st.contentEquals(title.getText());
		details.add(article.getText());
		System.out.println(article.getText());
		driver.navigate().back();
		}
		return details;
	}

}
