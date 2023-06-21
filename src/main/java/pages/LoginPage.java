package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openLoginPage() {
		driver.get("https://www.facebook.com/");
	}

	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}

	public void enterEmailAndPass(String a, String b) {
		driver.findElement(By.name("email")).sendKeys(a);
		driver.findElement(By.name("pass")).sendKeys(b);

	}

	public void clickOnLoginBtn() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	public String getErrMessage() {
		String actualErr = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(actualErr);
		return actualErr;

	}

	public void closeBrowser() {
		driver.quit();
	}
}
