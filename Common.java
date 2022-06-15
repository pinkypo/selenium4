package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
public static String Browser="FF";
//public static String url="https://demo.cyclos.org/ui/home";
public static String url="https://mypage.rediff.com/login/dologin";
//public static String url="https://www.facebook.com/login/";
public	static WebDriver d;
	public static void launchBrowser() throws Exception{
	
		if(Browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			d=new FirefoxDriver();
			//d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
		}
		else if(Browser.equals("GC"))
		{
			d=new ChromeDriver();
			//d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
		}
		else if(Browser.equals("Edge"))
		{
			d=new EdgeDriver();
			//d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new EdgeOptions());
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
	}
	public static void closeBrowser()
	{
		d.quit();
	}

}



