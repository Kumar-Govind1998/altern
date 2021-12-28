package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends genericlib.WebDriverUtility{
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='linner']")
	private WebElement Changelanguagebtn;
	
	@FindBy(xpath="//div[@class='lddnav']//a[1]")
	private WebElement hindibtn;

	@FindBy(xpath="//h2[@class='title']//a[text()='Explainers']")
	private WebElement ExplainersBtn;
	
	

	public WebElement getChangelanguagebtn() {
		return Changelanguagebtn;
	}


	public WebElement getHindibtn() {
		return hindibtn;
	}


	public WebElement getExplainersBtn() {
		return ExplainersBtn;
	}


	
	public void Changelanguage(WebDriver driver)
	{
		mouseHover(driver, getChangelanguagebtn());
		hindibtn.click();
	}
	
	public void getExplainerText(WebDriver driver)
	{
		scrollIntoView(driver, ExplainersBtn);
		String txt=ExplainersBtn.getText();
		System.out.println(txt);
		
	}
}
