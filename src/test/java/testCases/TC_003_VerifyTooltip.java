package testCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_003_VerifyTooltip extends BaseClass{
	
	@Test
	public void tool_tip() throws InterruptedException {
		
		beCognizant bcog = new beCognizant(driver);
		bcog.scrollToSeeAll();
		
		ArrayList<Boolean> expResults = new ArrayList<Boolean>();
		for(int i=0; i<=5; i++) {
			expResults.add(true);
		}
		Assert.assertEquals(bcog.toolTip(), expResults);

	}
}
