package practicedemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlinks {
	private static WebDriver driver = null;

	public static void main(String[] args) throws IOException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dubey\\Downloads\\12_october_automation\\chromedriver.exe");

		String homePage = "http://facebook.com/";

		driver = new ChromeDriver();
		driver.get(homePage);

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection htp = (HttpURLConnection) link.openConnection();
			htp.connect();
			int rescode = htp.getResponseCode();

			if (rescode >= 400) {

				System.out.println("broken url" + url);
			}

			else

			{
				System.out.println("valid url" + url);

			}

		}

	}
}
