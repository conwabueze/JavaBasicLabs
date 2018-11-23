import java.util.Scanner;
public class primeFinder {

	public static void main(String[] args) {
		/*
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = input.nextInt();
		System.out.println(isPrime(num));
		*/
		int count=0;
		for(int x=2;x<=1000;x++) {
			if(isPrime(x)) {
				System.out.print(x+"\t");
				count++;
			}
			if(count==10) {
				count=0;
				System.out.println();
			}
			
		}
	}
	
	public static boolean isPrime(int num) {
		for(int x=num-1;x>1;x--) {
			if(num%x==0) {
				return false;
			}
		}
		return true;
	}

}
