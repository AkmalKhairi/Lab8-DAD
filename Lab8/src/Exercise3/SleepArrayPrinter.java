package Exercise3;

import java.util.Random;

public class SleepArrayPrinter implements Runnable{

public void printArraySleep (String Threads) {
		
		try {
			String arr[] = {"It", "is", "recommended", "to", "use", "Calendar", "class."};
			int repeat = 10;
			String result[] = new String[repeat];
			Random randoms = new Random();
			for(int i=0, j=0; i<repeat && j<arr.length; i++, j++)
			{
				int randomIndexToSwap = randoms.nextInt(arr.length);
				result[i] = arr[randomIndexToSwap];
				if(j == arr.length -1)
			         j = -1;
				System.out.println(Threads + "[Random Array Extraction W1] => " + i + " array["+i+"] : "+result[i]);
				
				Thread.sleep(1000);
			}
			System.out.println("Suspended");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void run() {
	
	Thread Threads = Thread.currentThread();
	printArraySleep(Threads.getName());
	
	}
	
}
