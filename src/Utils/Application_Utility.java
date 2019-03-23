package Utils;

public class Application_Utility 
{
	public WebDriver driver ;
    public void BrowserUtility()
{
	String key="webdriver.driver.chrome";
	String value="./Softwares/chromedriver.exe";
	System.setProperty(key,value);
	String browser="chrome";
	String URL="https://uaccp.imshealth.com/portal/site/imsportal";
	switch(browser)
	{
	case "chrome":
		if(key.equals("webdriver.driver.chrome") & value.equals("./Softwares/chromedriver.exe"))
		{
			WebDriver driver=new ChromeDriver();
		    driver.get(URL);
			
		}
		break;
	case "Firefox":
		if(key.equals("webdriver.driver.gecko") & value.equals("./Softwares/geckodriver.exe"))
		{
			WebDriver driver=new FirefoxDriver();
		    driver.get(URL);
			
		}
		break;
		
		default:
			System.out.println("OOPS!!User has choosen other browser");
		
	}
}
public void UserLogin()
{
	
}

}
