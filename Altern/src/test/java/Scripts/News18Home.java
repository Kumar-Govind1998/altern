package Scripts;

import org.testng.annotations.Test;

import PomPages.HomePage;
import genericlib.BaseClass;

public class News18Home extends BaseClass {
	
	
	@Test()
	public void home_Test() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.scroll(driver);
		hp.getExplainerText(driver);
		hp.Changelanguage(driver);
		Thread.sleep(5000);
	}

}
