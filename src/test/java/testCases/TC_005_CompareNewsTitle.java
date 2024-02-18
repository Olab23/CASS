package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.aroundCognizantNews;
import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_005_CompareNewsTitle extends BaseClass {
	
	@Test
	public void all_news() {
		
		beCognizant bCog = new beCognizant(driver);
		bCog.scrollToSeeAll();
		bCog.clickSeeAll();
		
		aroundCognizantNews aCogN = new aroundCognizantNews(driver);
		Assert.assertEquals(aCogN.compare_Title(), true);
	}
}
