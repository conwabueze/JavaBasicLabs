import java.util.Arrays;

public class sortIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = { 6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5 };
		bubbleSort(arr);
		

	}

	public static void bubbleSort(double[] arr) {
		boolean changed = true;
		do {
			changed = false;
			for (int j = 0; j < arr.length - 1; j++)
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					for (int x = 0; x < arr.length - 1; x++) {
						System.out.print(arr[x] + " ");				
				}
					System.out.println();
					changed = true;	
			}
		} while (changed);

	
	}

/*
	public static void bubbleSort2(double[] arr) {
		boolean changed = true;
		while (!changed) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					for (int x = 0; x < arr.length - 1; x++) {
						System.out.print(arr[x] + " ");		
					}
					
				}
				System.out.println();
				changed = true;
		}
		
		}
	
	}
	*/
}
