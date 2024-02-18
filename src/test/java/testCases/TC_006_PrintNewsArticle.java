package testCases;

import org.testng.annotations.*;

import pageObjects.aroundCognizantNews;
import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_006_PrintNewsArticle extends BaseClass{
	
	@Test
	public void print_top5_news() {
		
		beCognizant bCog = new beCognizant(driver);
		bCog.scrollToSeeAll();
		bCog.clickSeeAll();
		
		aroundCognizantNews aCogN = new aroundCognizantNews(driver);
		aCogN.newsArtiles();
	}
}
