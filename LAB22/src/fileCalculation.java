import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileCalculation {
    public static void main(String[] args) {
        scanFile("test.txt");

    }


    public static void scanFile(String fileName) {
        int tot=0;
        int averageDivder=0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (true) {

                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
                String[] lineCalulation = line.split(" ");
                for(int x=0;x<lineCalulation.length;x++){
                    tot+=Integer.parseInt(lineCalulation[x]);
                    averageDivder++;
                }



                /*
                while(true){
                    tot+= input.nextInt();
                    averageDivder++;
                    if (tot == 0) {
                        break;
                    }
                }
                */


            }
        } catch (FileNotFoundException ex) {
            System.out.println("stop");
        } catch (IOException ex) {

        } catch (NullPointerException ex) {

        }
        System.out.println();
        System.out.println("Total:" + tot + " Average: " + tot/averageDivder);


    }
}
//    public static int lineTotal(String line){
//        Scanner input = new Scanner(line);
//
//    }
//    public static int lineAverage(String line){
//        Scanner input = new Scanner(line);
//
//    }
    /**/