package Tests;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Main.Reporter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AddToCart {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  Reporter rp;
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    rp = new Reporter();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void doAddToCart() throws Exception {

	rp.addSimple("<h2>Add product to cart</h2>");
	
	try {
		rp.add("preconditions"); 	
    
	// 1 | open | /index.php | 
	rp.add("// 1 | open | http://automationpractice.com/index.php | ");
    driver.get("http://automationpractice.com/index.php");
    
    // 2 | setWindowSize | 1400x1000 | 
    //rp.add("// 2 | setWindowSize | 1400x1000 | ");
    driver.manage().window().setSize(new Dimension(1400, 1000));

    // 3 | click | css=.sfHover > a | 
    rp.add("// 2 | click | button \"T-shirts\" | ");
    driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3)")).click();

    // 4 | click | css=.lnk_view > span | 
    rp.add("// 3 | click | product image | ");
    driver.findElement(By.className("product_img_link")).click();
    
    rp.add("test steps"); 	
    
    Thread.sleep(3000);

    // 7 | type | id=quantity_wanted | 2
    rp.add("// 4 | type | field \"Quantity\": 2");
    driver.findElement(By.id("quantity_wanted")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.id("quantity_wanted")).sendKeys("2");

    // 8 | select | id=group_1 | label=L
    rp.add("// 5 | select | field \"Size\": L");
    {
      WebElement dropdown = driver.findElement(By.id("group_1"));
      dropdown.findElement(By.xpath("//option[. = 'L']")).click();
    }

    // 9 | click | id=color_14 | 
    rp.add("// 6 | click | button \"Blue\" | ");
    driver.findElement(By.id("color_14")).click();
    
    // 10 | click | css=.exclusive > span | 
    rp.add("// 7 | click | button \"Add to cart\" | ");
    driver.findElement(By.cssSelector(".exclusive > span")).click();
    
    Thread.sleep(3000);
    
    // 11 | click | css=h2:nth-child(2) | 
    rp.add("// 8 | click | button \"Proceed to checkout\" | ");
    driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();

    rp.add("expected result"); 	
    
    // 12 | click | css=.button-medium > span | 
    rp.add("// 9 | find | text \"Faded Short Sleeve T-shirts\" | ");
    driver.findElement(By.xpath("//a[text()='Faded Short Sleeve T-shirts']"));
    
    // 13 | click | css=tr > .first_item | 
    rp.add("// 10 | find | text \"Color : Blue, Size : L\" | ");
    driver.findElement(By.xpath("//a[text()='Color : Blue, Size : L']"));
    
    // 14 | click | css=tr > .item:nth-child(2) | 
    rp.add("// 11 | find | text \"$33.02\" | ");
    driver.findElement(By.xpath("//td[text()='$33.02']"));
    
    //product
    rp.add("// 12 | find | text \"Product\" | ");
    driver.findElement(By.xpath("//th[text()='Product']"));
    
    //description
    rp.add("// 13 | find | text \"Description\" | ");
    driver.findElement(By.xpath("//th[text()='Description']"));
    
    //avail.
    rp.add("// 14 | find | text \"Avail.\" | ");
    driver.findElement(By.xpath("//th[text()='Avail.']"));
    
    //unit price
    rp.add("// 15 | find | text \"Unit price\" | ");
    driver.findElement(By.xpath("//th[text()='Unit price']"));
    
    //qty
    rp.add("// 16 | find | text \"Qty\" | ");
    driver.findElement(By.xpath("//th[text()='Qty']"));
    
    //total
    rp.add("// 17 | find | element \"Total (1)\" | ");
    driver.findElement(By.xpath("//th[text()='Total']"));
    
    //total products
    rp.add("// 18 | find | text \"Total products\" | ");
    driver.findElement(By.xpath("//td[text()='Total products']"));
    
    //total shipping
    rp.add("// 19 | find | text \"Total shipping\" | ");
    driver.findElement(By.xpath("//td[text()='Total shipping']"));
    
    //total
    rp.add("// 20 | find | element \"Total (2)\" | ");
    driver.findElement(By.xpath("//td[text()='Total']"));
    
    //tax
    rp.add("// 21 | find | text \"Tax\" | ");
    driver.findElement(By.xpath("//td[text()='Tax']"));
    
    //TOTAL
    rp.add("// 22 | find | element \"Total (3)\" | ");
    driver.findElement(By.xpath("//span[text()='Total']"));
    
    // 15 | click | css=.standard-checkout > span | 
    rp.add("// 23 | find | button \"Proceed to checkout\" | ");
    driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));

    rp.add("<b><font style=\"color:green;\">TEST PASSED!</font></b>");
    
	}
	  catch(Exception e){
		  e.printStackTrace();
		  rp.add("<p style=\"color:red;\">" + e.getMessage() + "</p>");
	  }
    
  }
}
