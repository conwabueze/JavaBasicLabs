public class recursiveBinary {
    public static void main(String[] args) {
        System.out.println(dec2Bin(156));
    }

    public static String dec2Bin(int value){
        int remainder = value%2;

        String num=Integer.toString(remainder);
        if(value>0){



        return dec2Bin(value/2)+" "+remainder;
        }

        else{
            return "";
        }
    }
}
