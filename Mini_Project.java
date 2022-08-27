package com.sel.pkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
  public static void main(String[] args) throws InterruptedException, IOException {
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
		dri.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		je.executeScript("window,scrollBy(0,500)");
		dri.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		je.executeScript("window,scrollBy(0,500)");
		dri.findElement(By.name("processAddress")).click();
		Thread.sleep(1000);
		dri.findElement(By.name("cgv")).click();
		dri.findElement(By.name("processCarrier")).click();
		dri.findElement(By.xpath("//a[@class='bankwire']")).click();
		dri.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		TakesScreenshot sc = (TakesScreenshot)dri;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\GANESH KUMAR\\eclipse-workspace\\Employee_Details\\Sel\\screenshot\\output.png");
		FileUtils.copyFile(source, destination);
		
		
		
}
}
