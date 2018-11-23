import java.util.Scanner;

public class convertMeekMilly {

	public static void main(String[] args) {
		Scanner input=  new Scanner(System.in);
		System.out.print("Enter millis: ");
		long millis = input.nextLong();
		
		convertMillis(millis);
	}
	public static String convertMillis(long millis) {
		long hours= 3600000;
		long mins= 60000;
		long seconds=1000;
		long remainder=0;
		
			remainder= millis%hours;
			hours = millis/hours;
			long mins1 = remainder/mins;
			remainder= remainder%mins;
			seconds = remainder/seconds;
		
		
		System.out.println(hours+":"+mins1+":"+seconds);
		return "bibby";
	}

}
