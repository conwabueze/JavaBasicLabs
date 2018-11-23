import java.util.Scanner;

public class toTheMax {
	public static int [ ] locateLargest(double [ ] [ ] a) {
		double maxRow=0;
		double maxCol=0;
		double max = 0;
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				if(a[row][col]>a[row+1][col+1]) {
					maxRow=row;
					maxCol=col;
					max = a[row][col];
				}
			}
		}
		System.out.print("The	largest	element	is	at (" + maxRow +","+ maxCol+")");
		return new int[] {(int)maxRow,(int)maxCol};
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = input.nextInt();
		double[][] uh=new double[row][col];
		int count = 1;
		for(int row1=0; row1<uh.length; row++) {
			for(int col2=0; col2<uh[row].length; col++) {
		System.out.print("Enter int for row "+count+" then press enter");
			}
		}
		locateLargest(uh);

	}
	
	

}
