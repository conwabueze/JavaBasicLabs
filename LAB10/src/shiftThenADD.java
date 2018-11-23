
public class shiftThenADD {

	public static void distribute(int[] values, int start_index) {
		int position = start_index + 1;
		int loopCount = values[start_index];
		values[start_index]=0;
		for (int x = 0; x < loopCount; x++) {
			if(position==values.length) position=0;
			
			values[position++]++;
		}

		// print out
		for (int s = 0; s < values.length; s++)
			System.out.print(values[s] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 6, 2, 4, 1, 5 };
		distribute(arr, 2);
	}

}
