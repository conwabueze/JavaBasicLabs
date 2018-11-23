import java.util.Scanner;

public class cutItPart2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String str = input.nextLine();
		System.out.println(backspace(str));
		

	}
	public static String backspace(String str) {
		StringBuilder cutIt = new StringBuilder(str);
		
		while(cutIt.indexOf("^H")!=-1) {
			int postion=cutIt.indexOf("^H");
			cutIt.delete(postion-1,postion+2); 
		}
		String finalCut = cutIt.toString();
		return finalCut;
	}
}
