import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = input.nextInt();
        System.out.println("Enter print length: ");
        int print = input.nextInt();
        createFibonacci(length,print);
    }

    public static void createFibonacci(int length, int print){
        ArrayList<Integer> nacci = new ArrayList<Integer>();
        nacci.add(0,1);
        nacci.add(1);

        for(int x=2;x<length;x++){
            nacci.add(x,(nacci.get(x-2)+nacci.get(x-1)));
        }
        nacci.remove(nacci.size()-1);


        System.out.println("Full");
        for(int x=0;x<nacci.size();x++){
            System.out.print(nacci.get(x)+" ");
        }
        System.out.println();
        System.out.println("Print length");
        for(int x=nacci.size()-print;x<nacci.size();x++){
            System.out.print(nacci.get(x)+" ");
        }

    }
}
