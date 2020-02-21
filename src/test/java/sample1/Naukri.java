package sample1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Naukri extends LibGlobal {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		browserLaunch();
		loadUrl("https://my.naukri.com/account/createaccount");
		windowmax();
		WebElement professional = driver.findElement(By.xpath("//button[text()='I am a Professional']"));
		click(professional);
		Thread.sleep(2000);
		WebElement txtUsername= driver.findElement(By.id("fname"));
		fill(txtUsername, getfromExcel(1,1));
		
		WebElement email= driver.findElement(By.id("email"));
		fill(email, getfromExcel(2, 1));
		
		
		WebElement pass= driver.findElement(By.name("password"));
		fill(pass, getfromExcel(3,1));
		Thread.sleep(2000);
		
		WebElement mobile= driver.findElement(By.name("number"));
		fill(mobile, getfromExcel(4,1));
		WebElement yearExp= driver.findElement(By.name("expYear"));
		click(yearExp);
		Thread.sleep(1000);
		fill(yearExp,getfromExcel(5,1));
		selectByVisibletext(yearExp, 5, 1);
		WebElement monthExp= driver.findElement(By.xpath("(//li[@ng-repeat-done-notification='3'])[1]"));
		click(monthExp);
		Actions a = new Actions(driver);
		a.moveToElement(monthExp);
		click(monthExp);
		
		
		fill(monthExp, getfromExcel(6,1));
		selectByVisibletext(monthExp, 6, 1);
		

		WebElement submit= driver.findElement(By.name("basicDetailSubmit"));
		click(submit);
		
	}

}
