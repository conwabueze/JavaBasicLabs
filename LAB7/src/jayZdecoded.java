import java.util.Scanner;

public class jayZdecoded {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String str = input.nextLine();
		System.out.println(expand(str));
	

	}
	public static String expand(String str) {
		String decoded="";
		for(int x=1; x<str.length(); x+=2) {
			String num = Character.toString(str.charAt(x));
			int extendCount=Integer.parseInt(num);
			String extendLetter=Character.toString(str.charAt(x-1));
			for(int y=1; y<=extendCount; y++) {
				decoded+=extendLetter;
			}
		}
		return decoded;
	}
}
