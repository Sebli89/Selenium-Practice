package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleretPractice {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
				driver.findElement(By.name("enter-name")).sendKeys("Sebelewengel");
				driver.findElement(By.id("alertbtn")).click();
				
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				driver.findElement(By.id("confirmbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().dismiss();

	}

}
