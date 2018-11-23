import java.util.Scanner;

public class marioCoins {
	
	public static String decimalToBinaryModified(int n) {

		StringBuilder s = new StringBuilder();
		while (n != 0) {
			s.append(n & 1);
			n = n >> 1;
		}
		while (s.length() < 9) {
			s.insert(0, "0");
		}
		return s.toString();
	}

	public static void main(String[] args) {

		int[][] m = new int[3][3];

		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer between 0-511: ");
		int n = input.nextInt();
		String binary = decimalToBinaryModified(n);

		int binIndex = 0;
		for (int i = 0; i < m.length; i++) {

			for (int k = 0; k < m[i].length; k++) {
				
				
				int cSide = (binary.charAt(binIndex++) == '0') ? 0 : 1;
				
				
				
				m[i][k] = cSide;
			}
		}
		for (int i = 0; i < m.length; i++) {

			for (int k = 0; k < m[i].length; k++) {
				
				char charmander = (m[i][k] == 0) ? 'H' : 'T';
				
				System.out.print(charmander + " ");
			}
			System.out.println("");
		}

	}



}
