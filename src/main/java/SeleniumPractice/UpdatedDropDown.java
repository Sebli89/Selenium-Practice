package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//check box

		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 
		 
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 driver.findElement(By.id("Div1")).getAttribute("style");
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		
		
		//dropdown
		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000L);
//		
//		int i=1;
//		while (i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//		}
//		
//		for (int i=1; i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
   }

}
