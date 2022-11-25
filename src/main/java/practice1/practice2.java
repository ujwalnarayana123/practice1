package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2 {

	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in");
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions act = new Actions(driver);
//		act.moveToElement(element).click().sendKeys("ujwal").build().perform();
		act.clickAndHold(element).moveToElement(element, 100, 0).perform();
		
	
	}

}
