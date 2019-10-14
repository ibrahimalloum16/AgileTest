package login.com.facebk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signon {
	WebDriver driver;
@BeforeTest
public void openBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\Desktop\\ib doc\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");}
@AfterTest
public void closeBrowser() {}
@Test
public void signOn() {
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gatyh");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("43678");
	boolean r=driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).isEnabled();
System.out.println(r);
}
}

