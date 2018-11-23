import java.util.Scanner;

public class reverseJelly {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.print("Enter your DNA strand: ");
		String strand = src.nextLine();
		System.out.println(altReverse(strand));
	}
	public static String altReverse(String dna) {
		String alt = "";
		for(int x=0;x<dna.length();x++) {
			if(dna.charAt(x)=='A') alt+="T";
			else if(dna.charAt(x)=='T') alt+="A";
			else if(dna.charAt(x)=='C') alt+="G";
			else if(dna.charAt(x)=='G') alt+="C";
		}
		StringBuilder transform = new StringBuilder(alt);
		transform.reverse();
		alt=transform.toString();
		return alt;
	}
}
