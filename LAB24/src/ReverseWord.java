public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverse("aibud"));
    }

    public static String reverse(String str){
        String firstLetter = str.substring(0,1);
        String lastLetter = str.substring(str.length()-1);
        //String middle= str.substring(1,str.length()-1);

        if(str.length()>1) {

            return lastLetter+(reverse(str.substring(1,str.length()-1)))+firstLetter;
        }else {
            return str;
        }
    }
}
