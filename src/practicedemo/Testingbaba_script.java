package practicedemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingbaba_script {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sd47860\\eclipse-workspace\\12_october_automation\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/");

		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(" //*[@class=\"nav-link\"][text()='web tables']")).click();

		driver.findElement(By.xpath(" //*[text()='Name:']//following::input[@name=\"name\"]")).sendKeys("shivam");

		driver.findElement(By.xpath(" //*[text()='Email:']//following::input[@title=\"eg name@gmail.com\"]"))
				.sendKeys("dubeyshviam890@@gmail.com");
		driver.findElement(By.xpath("//*[@class=\"btn btn-success save-btn\"]")).click();

		List<WebElement> ele = driver.findElements(By.xpath(" //*[@class=\\\"btn btn-success save-btn\"]"));
		for (WebElement dd : ele) {

			String out = dd.getText();
			System.out.println(out);

		}

	}
}