package sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ada extends LibGlobal {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();
		loadUrl("https://adactin.com/HotelApp/");
		windowmax();
		WebElement txtUsername = driver.findElement(By.id("username"));
		fill(txtUsername, getfromExcel(1,1));
		
		WebElement txtPass= driver.findElement(By.id("password"));
		fill(txtPass, getfromExcel(2,1));
		
		WebElement Login= driver.findElement(By.id("login"));
		click(Login);
		
		Thread.sleep(2000);
		
		WebElement Location= driver.findElement(By.id("location"));
		selectByVisibletext(Location, 3,1);
		Thread.sleep(2000);
		
		WebElement hotel= driver.findElement(By.id("hotels"));
		selectByVisibletext(hotel, 4,1);
		
		WebElement roomtype= driver.findElement(By.id("room_type"));
		selectByVisibletext(roomtype, 5,1);
		
		WebElement NoOfRoom= driver.findElement(By.id("room_nos"));
		selectByVisibletext(NoOfRoom, 6,1);
		
		WebElement NoOfAdults= driver.findElement(By.id("adult_room"));
		selectByVisibletext(NoOfAdults, 7,1);
		
		WebElement NoOfChild= driver.findElement(By.id("child_room"));
		selectByVisibletext(NoOfChild, 8,1);
		WebElement search= driver.findElement(By.id("Submit"));
		click(search);
		
		WebElement hotelselect= driver.findElement(By.id("radiobutton_0"));
		click(hotelselect);
		
		WebElement hotelselectOn= driver.findElement(By.id("continue"));
		click(hotelselectOn);
		
		Thread.sleep(2000);
		WebElement FirstName= driver.findElement(By.id("first_name"));
		fill(FirstName,getfromExcel(9, 1));
		
		WebElement LastName= driver.findElement(By.id("last_name"));
		fill(LastName,getfromExcel(10,1));
		
		
		WebElement BillingAddres= driver.findElement(By.id("address"));
		fill(BillingAddres, getfromExcel(11, 1));
		
		
		WebElement creditCardNO= driver.findElement(By.id("cc_num"));
		fill(creditCardNO, getfromExcel(12, 1));
		
		
		WebElement creditType= driver.findElement(By.id("cc_type"));
		selectByVisibletext(creditType, 13, 1);
		Thread.sleep(2000);
		
		WebElement month= driver.findElement(By.id("cc_exp_month"));
		selectByVisibletext(month, 14, 1);
		Thread.sleep(2000);
		
		WebElement year= driver.findElement(By.id("cc_exp_year"));
		selectByVisibletext(year, 15, 1);
		Thread.sleep(2000);
		
		WebElement ccv= driver.findElement(By.id("cc_cvv"));
		fill(ccv, getfromExcel(16, 1));
		Thread.sleep(2000);
		
		
		WebElement book= driver.findElement(By.id("book_now"));
		click(book);
		
		Thread.sleep(10000);
		WebElement book1= driver.findElement(By.id("my_itinerary"));
		click(book1);
		
		
	}

}
