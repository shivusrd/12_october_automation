package practicedemo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Flipkart_automation2

{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dubey\\Downloads\\12_october_automation\\chromedriver.exe");
		
		final String user = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]";
		final String password = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]";

		final String loginbutton = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]";
		
		WebDriver driver = new ChromeDriver();
		
		Actions actions = new Actions(driver);
		
		

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath(user)).sendKeys("8171765673");
		driver.findElement(By.xpath(password)).sendKeys("Shivu@srd1");
		driver.findElement(By.xpath(loginbutton)).click();
		Thread.sleep(2000);
		
		WebElement ele =   driver.findElement(By.xpath("//div[contains(text(),'shivam dubey')]"));
		actions.moveToElement(ele).perform();
		driver.findElement(By.xpath("//div[normalize-space()='My Profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='oKZoMV']")).click();
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//button[normalize-space()='SAVE']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	
	
		

		

		
	}
}
