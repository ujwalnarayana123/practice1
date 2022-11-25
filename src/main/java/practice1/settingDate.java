package practice1;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class settingDate {
WebDriver driver;
	public String setDate() {
		Date date = new Date();
		String da = date.toString();
		System.out.println(da);
		return da;
	}

	public String systeDateFormat() {
		driver = new ChromeDriver();
		Date date = new Date();
		String da = date.toString();
		String arr[] = da.split(" ");
		String day = arr[2];
		String month = arr[1];
		String year = arr[5];
		String time = arr[3].replaceAll(":", "-");
		String systemDate = day + " " + month + " " + year + " " + time;
		System.out.println(systemDate);
		return systemDate;

	}
}
