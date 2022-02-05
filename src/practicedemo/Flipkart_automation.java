package practicedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;

public class Flipkart_automation

{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dubey\\Downloads\\12_october_automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);

		Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();

		sendEsc.perform();

		driver.findElement(By.name("q")).sendKeys("utensils");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Action sendPageDownn = actions.sendKeys(Keys.PAGE_DOWN).build();

		sendPageDownn.perform();
		
		//*[@class=\"_1AtVbE col-12-12\"]/div  = correct
		String xpathNoRows = "//*[@class=\"s1Q9rs\"]";

		List<WebElement> listTotal = driver.findElements(By.xpath(xpathNoRows));

		System.out.println("Total no of Rows"+listTotal.size());

		for (int i = 1; i <= listTotal.size(); i++)

		{

			String xpathCol = "//*[@class=\"s1Q9rs\"][" + i + "]/div";

			List<WebElement> listCols = driver.findElements(By.xpath(xpathCol));

			System.out.println("No of Cols are" + listCols.size());
//
//			for (int j = 0; j < listCols.size(); j++)
//
//			{
//
//				String xpathProductName = "//*[@class=\"_1AtVbE col-12-12\"]/div[" + i + "]/div[" + j + "]/div/a[2]";
//
//				WebElement contentEle = driver.findElement(By.xpath(xpathProductName));
//
//				System.out.println(contentEle.getText().toString());
//			}
//			System.out.println("========================================");
		}
	}
}
