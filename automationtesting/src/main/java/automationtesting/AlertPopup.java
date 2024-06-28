package automationtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement confirmalert = driver.findElement(By.id("confirm"));
		confirmalert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); 
		// alert.accept(); // clicking on Ok button
		alert.dismiss(); // clicking on cancel button
		
		Thread.sleep(3000);
	//driver.switchTo().frame("iframe1");
	//	driver.findElement(By.id("icon-button")).click();
		
		// comment checkin my code in git
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://omayo.blogspot.com/");
		driver1.manage().window().maximize();

		WebElement confirmalert1 = driver.findElement(By.id("confirm"));
		confirmalert1.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert(); 
		// alert.accept(); // clicking on Ok button
		alert1.dismiss(); // clicking on cancel button
		
		Thread.sleep(3000);
	}

}
