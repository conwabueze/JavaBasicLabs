
public class toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lebronTravel(14);
	}
	public static void lebronTravel(int n) {
		int count = 0;
		for(int x = 1; x<=n; x++) {
			System.out.print(x + "\t");
			count++;
			if(count==7) System.out.println();
		}
	}
}
