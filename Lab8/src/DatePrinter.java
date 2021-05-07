import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter extends Thread {
	public void printDate () {

		for (int counter = 0; counter < 5; counter++) {

			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println("Date Printer " + formatter.format(date));  
		}
		
	}
	
	public void run() {
		printDate();
		
		}

}
