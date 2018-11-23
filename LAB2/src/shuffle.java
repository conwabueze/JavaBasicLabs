
public class shuffle {
	public static void main(String[] args) {
		System.out.print(shuffle("abcdefxyz"));
	}
	public static String shuffle(String str) {
		String alp = "abcdefghijklmnopqrstuvwxyz";
		String secondlast = "a";
		String last = "b";
		String empty = "";
		for(int x =0; x<str.length(); x++) {
			
			
			int position = alp.indexOf(Character.toString(str.charAt(x)));
			if(str.charAt(x)=='y') {
				empty+=secondlast;
			}
			if(str.charAt(x)=='z') {
				empty+=last;
			}
		
			empty+=Character.toString(alp.charAt(position+2));
			
			
		}
		return empty;
	}
}
