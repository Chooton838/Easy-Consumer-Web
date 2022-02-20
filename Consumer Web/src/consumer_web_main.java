import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class consumer_web_main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		driver.get("https://easy.com.bd/recharge/top-up");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	     
		driver.findElement(By.xpath("/html/body/div[2]/app-root/app-main-layout/app-nav/nav/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"login_window\"]/div[1]/input")).sendKeys("01689343838");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login_window\"]/div[2]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"password_window\"]/div[1]/input")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"sign_in_button\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"typeahead-basic\"]")).sendKeys("01689343838");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"telecom-operator\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"telecom-operator\"]/option[6]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"connection-type\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"connection-type\"]/option[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"top-up\"]/div[1]/div[2]/form/div[2]/div/div[4]/input")).sendKeys("50");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"top-up\"]/div[1]/div[2]/form/button[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"requested_identifier\"]")).sendKeys("01753332391");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"request_window\"]/form/div[7]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-success-popup/div/div/div/div[4]/button")).click();
		Thread.sleep(5000);

	}

}
