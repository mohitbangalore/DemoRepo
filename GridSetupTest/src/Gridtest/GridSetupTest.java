package Gridtest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSetupTest {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		String hubURL="http://192.168.250.21:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubURL),options);
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
