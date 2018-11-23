import java.util.Scanner;

public class calanderMonth {
	public  static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter days: ");
		int days = src.nextInt();
		System.out.print("Enter offSet: ");
		int offSet = src.nextInt();
		calendar(days,offSet);
	}
	
	public static int calendar (int days, int offSet) {
		int start = 7 - offSet;
		int count = 0;
		for(int x = 1; x<=offSet; x++) {
			System.out.print(" \t");
		}
		for(int x = 1; x<=start; x++) {
			System.out.print("\t"+x);
		}
		System.out.println();
		for(int x=start+1; x<=days;x++) {
			System.out.print(" \t"+x);
			count++;
			if(count==7){
				System.out.println();
				count=0;
			}
		}
		return 0;
	}
}
