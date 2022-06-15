import java.sql.Connection;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First {
	WebDriver d;
	Connection con;
	private CharSequence amount2;
	@Test
	public void testFirst() throws Exception
	{
		// Load web page
		d.get("https://demo.cyclos.org/ui/login");
		// Click on Login

}
@BeforeMethod
public void setUp1()
{
		
	// Launch the browser
	
	 d = new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
}
@AfterMethod
public void tearDown1()
{
	// Close the browser
	d.quit();
}
}