package org.example;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example2 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenJunit\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}
	@AfterClass
	public static void afterClass() {
		driver.close();
	}
	@Before
	public void beforeMethod() {
		System.out.println("Before:");
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void afterMethod() {
		System.out.println("After:");
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("welcome");
	}
	@Test
	public void tc2() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("testing");
	}
	@Test
	public void tc3() {
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
	}
}
