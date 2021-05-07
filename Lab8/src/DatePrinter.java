import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter extends Thread {
	public void printDate (String Threads) {

		for (int counter = 0; counter < 10; counter++) {

			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(Threads + "= Date Printer " + formatter.format(date));		}
		
	}
	
	public void run() {
		Thread Threads = Thread.currentThread();
		printDate(Threads.getName());
		
		}

}
