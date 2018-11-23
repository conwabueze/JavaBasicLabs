 import java.util.Scanner;

public class youNeedToCutIt {
	
 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in); 
	 System.out.println("Enter your sentence: ");
	 String line = input.nextLine();
	 System.out.println(cutIt(line));
	
 }

public static String cutIt(String a) {
	int spaceCount = 0;
	int head = 0;
	int tail = 0;
	for(int x=0; x<a.length(); x++) {
		if(a.charAt(x)==' ') {
			spaceCount++;
			if(spaceCount == 2) {
				head = x;
			}
			if(spaceCount == 3) {
				tail = x;
			}
		}
		//if(spaceCount==2) head=x;
		//if(spaceCount==3) tail=x;
		//break;
	}
	String word = a.substring(head+1, tail);
	return word;
}

}
