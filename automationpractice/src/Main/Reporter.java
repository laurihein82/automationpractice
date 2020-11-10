package Main;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Reporter {
	
	public FileWriter report;
	public BufferedWriter bw;

	// creating temporary report file
	public Reporter() {

		try {
	        report = new FileWriter("temp.html", true);
	        bw = new BufferedWriter(report);
	        bw.close();
	        
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	// adding test steps to report
	public void add(String input) {
		
		try {
			FileWriter fw = new FileWriter("temp.html", true);
			    bw = new BufferedWriter(fw);
			    
			    PrintWriter out = new PrintWriter(bw);
			    out.println("<li>" + input + "</li>");
			    out.close();
			    bw.close();
			    
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
	
	// adding other stuff to report without <li> formatting
	public void addSimple(String input) {
		
		try {
			FileWriter fw = new FileWriter("temp.html", true);
			    bw = new BufferedWriter(fw);
			    
			    PrintWriter out = new PrintWriter(bw);
			    out.println(input);
			    out.close();
			    bw.close();
			    
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
}
