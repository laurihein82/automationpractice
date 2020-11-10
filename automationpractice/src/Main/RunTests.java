package Main;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tests.*;

public class RunTests {
	
	private static WebDriver driver;
	static String filename;
	
	// main method to initiate test run
	public static void main(String args[]) throws IOException {
		JUnitCore junit = new JUnitCore();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		junit.run(SignIn.class, ProductDetailedView.class, AddToCart.class, Checkout.class, PasswordRecoveryNegative.class);

		results();
		
		// launching report
		File htmlFile = new File(filename);
		Desktop.getDesktop().browse(htmlFile.toURI());
		
	}
	
	// assigning unique name to temporary report file
	public static void results() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		filename = "report-" + dtf.format(now) + ".html";
		
		File file = new File("temp.html");
		File file2 = new File(filename);
		file.renameTo(file2);
		
	}

}
