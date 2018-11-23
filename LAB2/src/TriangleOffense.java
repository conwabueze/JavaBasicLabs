
public class TriangleOffense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleNumbers(22);

	}
	public static void TriangleNumbers(int n) {
		int levelUp=3;//number to be printed out
		int upOne=3;//number added to make next number
		int threeCount=3;//count limit to know when to change line
		int changeLine=0;//count to changeline
		
		System.out.print(1);
		System.out.println();
		
		for(int x=1; x<=n-2; x++) {
			System.out.print(levelUp + ", ");
			levelUp+=upOne;
			upOne++;
			changeLine++;
			if(changeLine == threeCount) {
				threeCount+=3;
				changeLine=0;
				System.out.println();
				
			}
			
			if(x==n-2) {
				System.out.print(levelUp);
				
			}
		}
	}

}
