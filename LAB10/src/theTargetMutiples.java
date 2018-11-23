
public class theTargetMutiples {

	public static void main(String[] args) {
		int[] values = { 3, 1, 6, 2, 4, 1, 5 };
		distribute(values, 2);

	}

	public static void distribute(int[] values, int start_index) {
		
		for(int x=0; x<values.length; x++) {
			values[start_index+1]++;
		}
		
		// print out
		
			System.out.print(values[3] + " ");
	}
}
