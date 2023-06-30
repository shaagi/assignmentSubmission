package tests;

import java.time.Duration;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import webpages.subjCardPageLearnForward;


public class clickAQuickLinkTest {
	WebDriver driver;
	
	@Before
	public void setup() {
		//use Chrome Driver
//		driver = new ChromeDriver();
		//use Firefox Driver
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://tvolearn.com");
		
		driver.findElement(By.xpath("//button[@aria-controls='SiteNavLabel-elementary-k-8']")).click();
		
		driver.findElement(By.xpath("(//a[@href='/pages/grade-7'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href='/pages/grade-7-language']")).click();
//		driver.manage().window().maximize();
	}
	
	@Test
	public void clickAQuickLink() {
		subjCardPageLearnForward starterPage = new subjCardPageLearnForward(driver);
		starterPage.clickOnQuickLink();
	}
	
	@After
	public void close() {
//		driver.close();
	}
}
