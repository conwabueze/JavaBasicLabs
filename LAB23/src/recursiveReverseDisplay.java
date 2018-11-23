public class recursiveReverseDisplay {
    public static void main(String[] args) {
        reverseDisplay(54321);

    }

    public static void reverseDisplay(int value){
        int lastDigit = value%10;
        int everyThingElse= value/10;

        if(everyThingElse==0){
            System.out.print(lastDigit);

        }else{
            System.out.print(lastDigit);
            reverseDisplay(everyThingElse);
        }

    }
}
