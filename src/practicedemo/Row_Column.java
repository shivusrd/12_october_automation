package practicedemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class Row_Column

{
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dubey\\Downloads\\12_october_automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='navbtn_tutorials']//i[@class='fa fa-caret-down']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Learn HTML']")).click();
		
		driver.findElement(By.xpath("//div[@id='sidenav']//a[18]")).click();
		
		

		int row = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		System.out.println(row);

		int col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(col);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td"));
		System.out.println(list.size());

		for (int i = 0; i <= 17; i++) {

			String actual = list.get(i).getText();
			System.out.println("" + "");
			System.out.print(actual+"\n");
			
			continue;
		}

		driver.quit();

	}
}
