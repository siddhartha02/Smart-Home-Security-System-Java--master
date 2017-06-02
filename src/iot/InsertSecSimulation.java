package iot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InsertSecSimulation implements Runnable{
	Thread thread = new Thread(this);
	public InsertSecSimulation(){
		thread.start();
	}
	public void run(){
		while(true)
		{
			
		try{
			 
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String time = dateFormat.format(cal.getTime());
		Server.insertSecData(4003);
	//	Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
