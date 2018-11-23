import java.util.ArrayList;
import java.util.Arrays;

public class Welsh {
    public static void main(String[] args) {
    ArrayList<String> breakdown = welshLetters("ddeeffffffe");
    for(int x=0; x<breakdown.size();x++){
        System.out.print(breakdown.get(x)+" ");
        }

    }

    public static ArrayList<String> welshLetters(String word){
        ArrayList<String> watchFor = new ArrayList<String>(Arrays.asList("ch","dd","ff","ng","ll","ph","rh","th"));
        ArrayList<String> letters = new ArrayList<String>();
        int i=0;
        int count=0;

            while(i<word.length()) {
                if(i+1<word.length()){
                    if(watchFor.contains(word.charAt(i) + ""+ word.charAt(i + 1))) {
                        letters.add(word.charAt(i) + "" + word.charAt(i + 1));
                        i+=2;
                    }
                }else{
                    letters.add(word.charAt(i)+"");
                    i++;

                }
            }

        return letters;
    }
}
