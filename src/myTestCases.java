import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	
	WebElement driver=(WebElement) new ChromeDriver();
	
	String url="https://global.almosafer.com/";
	
	
@BeforeTest
public void mySetup() {
	
	   ((RemoteWebDriver) driver).get(url);
	
}
@Test
public void firstTest() {
	
	
	
}

}
