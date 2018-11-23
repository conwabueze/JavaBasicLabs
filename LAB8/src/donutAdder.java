import java.util.Scanner;

public class donutAdder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter binary: ");
		String s1 = input.nextLine();
		System.out.println("Enter binary 2: ");
		String s2 = input.nextLine();
		System.out.println(addBinary(s1, s2));
		System.out.println("");
		System.out.println("Enter a base 10 value: ");
		int x1 = input.nextInt();
		System.out.println("Enter length in bits: ");
		int x2 = input.nextInt();
		System.out.println(toTwosComplement(x1,x2));
		
	}
	public static String pad(String str, int length) {
		if(str.length()>length) return str;
		else if(str.length()<length) {
			int count = length-str.length();
			String zero = "";
			while (count!=0){
				zero+="0";
				count--;
			}
			String buu = zero + str;
			return buu;
		}
		return "huh?";
	}
	
	public static String addBinary(String binary1, String binary2) {
		String result = "";
		int carryBit = 0;

		String altBinary1 = "", altBinary2 = "";
		if (binary1.length() < binary2.length()) {
			altBinary1 = pad(binary1, binary2.length());
			altBinary2 = binary2;

		} else if (binary2.length() < binary1.length()) {
			altBinary2 = pad(binary2, binary1.length());
			altBinary1 = binary1;

		} else {
			altBinary1 = binary1;
			altBinary2 = binary2;

		}
		for (int x = altBinary2.length() - 1; x >= 0; x--) {
			if (carryBit + Character.getNumericValue(altBinary1.charAt(x))
					+ Character.getNumericValue(altBinary2.charAt(x)) == 0) {
				result = "0" + result;
				carryBit = 0;
			} else if (carryBit + Character.getNumericValue(altBinary1.charAt(x))
					+ Character.getNumericValue(altBinary2.charAt(x)) == 1) {
				result = "1" + result;
				carryBit = 0;
			} else if (carryBit + Character.getNumericValue(altBinary1.charAt(x))
					+ Character.getNumericValue(altBinary2.charAt(x)) == 2) {
				result = "0" + result;
				carryBit = 1;
			} else if (carryBit + Character.getNumericValue(altBinary1.charAt(x))
					+ Character.getNumericValue(altBinary2.charAt(x)) == 3) {
				result = "1" + result;
				carryBit = 1;
			}
			
			else {
			}
		}
		if(carryBit == 1){
			result = carryBit + result;
		}

		return result;
	}

	public static String toTwosComplement(int val, int lengthOfComp) {
		String s = "";
		if (val > 0) {
			s = pad(toBinary(val),lengthOfComp);
			
		} else {

			String temp = toBinary(Math.abs(val));
			temp = pad(temp, lengthOfComp);
			temp = onesComplement(temp);

			int carryBit = Character.getNumericValue(temp.charAt(lengthOfComp - 1)) + 1;
			if (carryBit == 2) {
				carryBit = 1;
				s = s + '0';

			} else {
				carryBit = 0;
				s = s + '1';
			}

			for (int x = temp.length() - 2; x >= 0; x--) {
				if (carryBit + Character.getNumericValue(temp.charAt(x)) == 2) {
					s = '0' + s;
					carryBit = 1;
				} else if (carryBit + Character.getNumericValue(temp.charAt(x)) == 1) {
					s = '1' + s;
					carryBit = 0;
				} else if (carryBit + Character.getNumericValue(temp.charAt(x)) == 0) {
					s = '0' + s;
					carryBit = 0;

				}
			}

		}

		return s;
	}

	public static String toBinary(int val) {
		String s = "";
		int remainder;
		int temp = val;
		for (int x = 0;; x++) {
			remainder = temp % 2;
			temp = temp / 2;

			s = Integer.toString(remainder) + s;
			if (temp == 0) {
				break;

			}
		}

		return s;

	}

	public static String onesComplement(String binary) {
		String empty = "";
		for (int x = 0; x < binary.length(); x++) {
			if (binary.charAt(x) == '1') {
				empty = empty + "0";

			} else {
				empty = empty + "1";
			}

		}

		return empty;
	}
}
