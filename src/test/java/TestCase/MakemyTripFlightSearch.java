package TestCase;

import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.BrowserLaunch;
import Utils.ExcelFileHandling;
import Utils.PropertyFileHandle;

public class MakemyTripFlightSearch extends BrowserLaunch {
	
	String currentUrl =null;

	
@BeforeSuite
public void launchTheBrowser()
{
	launch();
	
}

@BeforeTest()
public void EnterTheURL()
{
	currentUrl = PropertyFileHandle.propreaddata().getProperty("url");
	// driver.get(currentUrl);
	test.log(LogStatus.INFO, "The following url is enterd : "+currentUrl);
}


@Test(priority=1)
public void EnterValidCustomer()
{
	
}


@AfterSuite
public void teatdown()
{
	report.flush();
	driver.quit();
}


}
