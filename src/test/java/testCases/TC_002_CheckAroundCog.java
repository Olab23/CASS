package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_002_CheckAroundCog extends BaseClass{
	
	@Test
	public void check_around_cog() throws InterruptedException {
		
		beCognizant bcog = new beCognizant(driver);
		boolean displayed = bcog.checkAroundCog();
		Assert.assertEquals(displayed, true, "Around Cognizant is not Displayed");
	}
}
