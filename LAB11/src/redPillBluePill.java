/*An	n x	n matrix	is	called	a	positive	Markov	matrix if	each	element	is	positive	and	the	sum	
of	the	elements	in	each	column	is	1.	Define	the	following	method	to	check	whether	a	
matrix	of	double values	is	a	positive	Markov	matrix:
public static boolean isMarkovMatrix (double [ ] [ ] m)
Write	a	test	program	that	prompts	the	user	to	enter	a	3	x	3	matrix	of	double values	
and	reports	whether	it	is	a	positive	Markov	matrix.*/


public class redPillBluePill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m = {{0.15,0.875,0.375},
						{0.55,0.005,0.225},
						{0.30,0.12,0.4}};
		
		System.out.print(isMarkovMatrix(m));
				
		}

	
	public static boolean isMarkovMatrix (double [ ] [ ] m) {
		double sum = 0;
		boolean is = false;
		for(int col=0; col<m.length; col++) {
			for(int row=0; row<m.length;row++) {
				
				sum+=m[row][col];
				if(row==m.length-1) {
				if(sum==1.00) is=true;
				else  is=false;
				sum=0;
				}
			}
		}
		
		return is;
	}


}
