public class hexToDec {
    public static void main(String[] args) {
        System.out.println(parseHex("1128"));
    }

    public static int parseHex(String hex){
        int decimal=0;
        int count=0;
        for (int x=hex.length()-1;x>0;x--){
            if((hex.charAt(x)>='A'||hex.charAt(x)<='F')&&(hex.charAt(x)>='0'||hex.charAt(x)<='9')){
            decimal+=(int)Integer.parseInt(hex.charAt(x)+"")*Math.pow(16,count);
            }else{
                System.out.println("what are you doing");
            }
        }

        return decimal;
    }

//    public class HexformatException(){
//     throw new HexformatException();
//    }
}


