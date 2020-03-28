package practicetestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void verifyTitleOfThePage() {
		
		System.setProperty("webdriver.chrome.driver","K:\\Eclipse\\SampleSele\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String data=driver.getTitle();
		System.out.print(data);	
		Assert.assertEquals(data, "Google");
	
	
	
}
	
}
