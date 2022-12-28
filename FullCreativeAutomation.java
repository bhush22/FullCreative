package automationQa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FullCreativeAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://trello.com/en");
		 
		 driver.findElement(By.xpath("//*[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).click();
		 
		 driver.findElement(By.id("user")).sendKeys("bramteke22@gmail.com");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("password")).sendKeys("Mabusau123@");
		 driver.findElement(By.xpath("//*[text()='Log in']")).click();
		 Thread.sleep(3000);
		 
		 
			 driver.findElement(By.xpath("//*[text()='Create new board']")).click();
			 Thread.sleep(3000);
			
			
			driver.switchTo().activeElement();
	
		    driver.findElement(By.xpath("//*[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']" )).sendKeys("QA");
		    driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
			Thread.sleep(3000);
			
			driver.switchTo().activeElement();
		  
         	driver.findElement(By.xpath("//*[@class='list-name-input']")).sendKeys("List A");
			driver.findElement(By.xpath("//*[@class='list-name-input']")).sendKeys(Keys.ENTER);
			
			driver.switchTo().activeElement();
			
			driver.findElement(By.xpath("//*[@placeholder='Enter list title…']")).sendKeys("List B");
			driver.findElement(By.xpath("//*[@class='list-name-input']")).sendKeys(Keys.ENTER);
			Actions act = new Actions(driver); 
			act.sendKeys(Keys. ESCAPE);
			
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//*[contains(text(),'Add a card')]")).click();
			driver.findElement(By.xpath("//*[@placeholder='Enter a title for this card…']")).sendKeys("Demo");
			driver.findElement(By.xpath("//*[@placeholder='Enter a title for this card…']")).sendKeys(Keys.ENTER);
			
			driver.switchTo().defaultContent();
			
			WebElement Target=driver.findElement(By.xpath("//*[@class='list-card-details js-card-details']"));
			WebElement Destination=driver.findElement(By.xpath("//div[@id='board']//div[2]//div[1]//div[3]"));
			
			Actions act1 = new Actions(driver);
			act1.dragAndDrop(Target, Destination).build().perform();
			
			WebElement coordi=driver.findElement(By.xpath("//*[@class='list-card-title js-card-name']"));
			
			
			Point point = coordi.getLocation();
			int xcord = point.getX();
			System.out.println("Position of the webelement from left side is "+xcord +" pixels");
			
			int ycord = point.getY();
			coordi.getLocation();
			System.out.println("Position of the webelement from left side is "+ycord +" pixels");
			
			driver.findElement(By.xpath("//span[@title='Bhushan Ramteke (bhushanramteke)']")).click();
			driver.switchTo().activeElement();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
			driver.findElement(By.xpath("//*[@class=\"css-19r5em7\"]//*[contains(text(),'Log out')]")).click();
			Thread.sleep(3000);
			
     		driver.close();
		
		
		
	}

}
