package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
			//Static dropdown
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		Select dropdown = new Select(staticDropdown);
//		
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
			
//			//Daynamic Dropdown index
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@ value='BLR']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@ value='DEL'])[2]")).click();
		
		//Daynamic Dropdown using child parent relationship Xpath
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@ id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@ value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@ value='DEL']")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
