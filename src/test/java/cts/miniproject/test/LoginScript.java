package cts.miniproject.test;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

public void loginToApplication( ) {
System.setProperty("webdriver.chrome.driver", "K:\\Eclipse\\SampleSele\\src\\test\\resources\\binaries\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.findElement(By.className("txtUsername")).sendKeys("Admin");
driver.findElement(By.className("txtPassword")).sendKeys("admin123");
driver.findElement(By.className("btnlogin")).click();


}

}

