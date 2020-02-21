package sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fb extends LibGlobal {
	public static void main(String[] args) throws IOException {
		browserLaunch();
		loadUrl("https://www.facebook.com/");
		windowmax();
		WebElement txtUserName= driver.findElement(By.id("email"));
		fill(txtUserName,getfromExcel(1,0));
		WebElement txtPass= driver.findElement(By.id("pass"));
		fill(txtPass, getfromExcel(1,1));
		WebElement Login= driver.findElement(By.id("loginbutton"));
		click(Login);
		
		
		
	}

}
