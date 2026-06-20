/*Write a program that diplays the GMT current time*/
public class CurrentTime{
	public static void main(String[] args){
		//obtain the milliseconds since 1 january 1970
		long totalMilliSeconds = System.currentTimeMillis();
                long totalSeconds = totalMilliSeconds/1000;
		long currentSeconds = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinutes = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHours = totalHours%24;

  		System.out.println("current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
	}
}