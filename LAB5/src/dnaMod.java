import java.util.Scanner;

public class dnaMod {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.print("Enter your DNA strand");
		String strand = src.nextLine();
		System.out.println(altReverse(strand));
	}
	public static String altReverse(String dna) {
		String change = "";
		for(int x=0;x<dna.length();x++) {
			if(dna.charAt(x)=='A') change+="T";
			else if(dna.charAt(x)=='T') change+="A";
			else if(dna.charAt(x)=='C') change+="G";
			else if(dna.charAt(x)=='G') change+="C";
		}
		
		for(int x=dna.length()-1;x<0;x--) {
			String ch = Character.toString(dna.charAt(x));
			change+=ch;
		}
		return change;
	}
	
}
