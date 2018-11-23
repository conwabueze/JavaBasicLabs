import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter red value: ");
        int red=input.nextInt();
        System.out.println("Enter green value: ");
        int green=input.nextInt();
        System.out.println("Enter blue value: ");
        int blue=input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Enter color name: ");
        String name = input.nextLine();

        System.out.println("Enter opacity value: ");
        int opacity=input.nextInt();


        AlphaChannelColor color1 = new AlphaChannelColor(red, green, blue, name ,opacity);
        System.out.println(color1.getName());
    }
}
