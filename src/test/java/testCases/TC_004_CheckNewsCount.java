package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_004_CheckNewsCount extends BaseClass{
	
	@Test
	public void news_count() {
		
		beCognizant bcog = new beCognizant(driver);
		bcog.scrollToSeeAll();
		Assert.assertEquals(bcog.countNews(), 6);
	}

}
