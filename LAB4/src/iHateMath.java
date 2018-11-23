
public class iHateMath {
	public static void main(String args[]) {
		System.out.println("Degree\tSin\tCos");
		for(int x=0; x<=360; x+=10) {
		double sin = Math.abs(Math.sin(Math.toRadians(x)));
		double cos = Math.abs(Math.cos(Math.toRadians(x)));
		System.out.printf("%d\t %.3f\t %.3f\n",x,sin,cos);
		}
	}

}
