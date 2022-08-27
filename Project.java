package com.sel.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANESH KUMAR\\eclipse-workspace\\Employee_Details\\Sel\\Driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://automationpractice.com/index.php");
		dri.manage().window().maximize();
		dri.findElement(By.xpath("//a[@class='login']")).click();
		dri.findElement(By.id("email")).sendKeys("ganesh1234.gk30@gmail.com");
		dri.findElement(By.name("passwd")).sendKeys("*n4RmxxBawaK$Yy");
		dri.findElement(By.id("SubmitLogin")).click();
		dri.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
	    JavascriptExecutor je =(JavascriptExecutor)dri;
	    Thread.sleep(2000);
	    je.executeScript("window,scrollBy(0,500)");
	    Thread.sleep(2000);
	    WebElement dress = dri.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
	    dress.click();
		WebElement frame = dri.findElement(By.xpath("//iframe[@hspace='0']"));
		dri.switchTo().frame(frame);
		dri.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		dri.switchTo().defaultContent();
		Thread.sleep(2000);
		dri.findElement(By.xpath("(//a[@rel='nofollow'])[5]")).click();
		Thread.sleep(2000);
		dri.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		
		
	}

}
