package sample1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDeal extends LibGlobal {
	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaunch();
		loadUrl("https://www.snapdeal.com/");
		windowmax();
		WebElement search = driver.findElement(By.id("inputValEnter"));
		fill(search, "iphone");
		WebElement searchicon = driver.findElement(By.className("searchTextSpan"));
		click(searchicon);
		Thread.sleep(2000);
		WebElement priceFilter = driver.findElement(By.name("toVal"));
		click(priceFilter);
		Robot r =new Robot();
	for (int i = 0; i <4; i++) {
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		
		
	}
	for (int i = 0; i < 3; i++) {
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);	
		
		
	}
	
			
				
		
		
		fill(priceFilter, "5000");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
		
		
		
		Thread.sleep(10000);
		 List<WebElement> AllItemInPage = driver.findElements(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
		 Thread.sleep(5000);
		 for (WebElement eachItem : AllItemInPage) {
			System.out.println(eachItem.getText());
			
		}
		
	}

}
