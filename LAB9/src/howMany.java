import java.util.Arrays;
public class howMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int x=0; x<arr.length;x++)
			arr[x]=(int)(Math.random()*100);
		
		valueCounter(arr);

	}

	public static void valueCounter(int[] values) {
		int[] count= new int[100];
		for(int x=0; x<values.length; x++) {
			int temp = values[x];//values in side the arrays value index;
			count[temp]++;
		}
		
		for(int z=0; z<count.length; z++) {
			if(count[z]!=0)
				System.out.println(z + " occurs " + count[z] + " times");
		}
	}
	
	
/*
	public static void valueCounter(int[] values) {
		Arrays.sort(values);
		for (int k = 0; k < values.length; k++) {
			System.out.print(values[k] + " ");
		}
		System.out.println(" ");
	}
*/
	/*
	 * public static void valueCounter (int [ ] values) { for(int x
	 * =0;x<values.length;x++) { int searchFor =values[x]; int count=0;
	 * 
	 * if(values[x]!=-1) {
	 * 
	 * 
	 * 
	 * for(int y=values[x]+1;y<=values.length-1; y++) {
	 * 
	 * if(values[y]==searchFor) { count++; values[y]=-1; } }
	 * 
	 * } System.out.println(searchFor+" "+count); }
	 * 
	 * } /* public static void valueCounter (int [ ] values) { int searchFor = 0;
	 * int count = 0;
	 * 
	 * for(int x =0; x<values.length; x++) { for(int y=0; y<=100; y++) {
	 * if(searchFor == values[x]) { count++; } } if(x==values.length-1) {
	 * System.out.print(searchFor+" occurs"+count+ "time(s)"); System.out.println();
	 * count=0; } } }
	 */
}
