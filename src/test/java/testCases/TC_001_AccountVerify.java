package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.beCognizant;
import testBase.BaseClass;

public class TC_001_AccountVerify extends BaseClass{
	
	@Test
	public void verify_emp_acc() throws InterruptedException {
		
		beCognizant bcog = new beCognizant(driver);
		bcog.clickId();
		Assert.assertEquals(bcog.checkId(), "Bulbule, Anurag (Cognizant)");
	}
}
