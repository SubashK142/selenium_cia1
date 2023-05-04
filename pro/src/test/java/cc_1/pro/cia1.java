package cc_1.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cia1 {
	    public static void main( String[] args ) throws InterruptedException
	    {
	    	WebDriverManager.edgedriver().setup();
			WebDriver driver= new EdgeDriver();
	        driver.get("https://www.amazon.in/Redmi-12-Pro-5G-Glacier/dp/B0BRVFZSGV/ref=sr_1_2?keywords=Redmi+note+12+5g+pro&qid=1683194067&sr=8-2");
	        driver.manage().window().maximize();
	        String title = driver.getTitle();
	        String etitle = "Redmi Note 12 Pro 5G (Glacier Blue, 6GB RAM, 128GB Storage) : Amazon.in: Electronics";
	        System.out.println(title);
	        if(title.equals(etitle)) {
	        	System.out.println("Matched");
	        }
	        else {
	        	System.out.println("Not matched");
	        }
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	        Thread.sleep(5000); 
	        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
	        System.out.println("Is item added to cart:" + present);
	        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
	        Thread.sleep(2000);
	        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
	        String extext = "Your Amazon Cart is empty.";
	        if(removeText.equals(extext)) {
	        	System.out.println("Product is removed");
	        }
	        driver.get("https://www.amazon.in/Redmi-12-Pro-5G-Glacier/dp/B0BRVFZSGV/ref=sr_1_2?keywords=Redmi+note+12+5g+pro&qid=1683194067&sr=8-2");
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	        Thread.sleep(2000);
	        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("6379667919");
		    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("subash@123");
		    driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	        String sign = driver.getTitle();
	        System.out.println(sign);
	        
	        String esign = "Amazon Sign In";
	        
	        
	        if(sign.equals(esign)) {
	        	System.out.println("Success");
	        }
	        else {
	        	System.out.println("Failure");
	        }
	    }

}
