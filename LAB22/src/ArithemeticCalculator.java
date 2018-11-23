import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithemeticCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Calculation: ");


        String calculation = input.nextLine();


        input = new Scanner(calculation);
        boolean breakCondition = true;

            try {
                int num1 = input.nextInt();
                String operator = input.next();
                int num2 = input.nextInt();
                int answer = 0;
                switch (operator) {
                    case "+":
                        answer = num1 + num2;
                        System.out.println(answer);
                        break;
                    case "-":
                        answer = num1 - num2;
                        System.out.println(answer);
                        break;
                    case "*":
                        answer = num1 * num2;
                        System.out.println(answer);
                        break;
                    case "/":try {
                        answer = num1 / num2;
                        break;
                    }catch(ArithmeticException ex){
                        System.out.println("You cant divde by 0");
                    }
                }


            }
            catch (ArithmeticException ex){

            }
            catch (InputMismatchException ex) {
                System.out.println("Wrong input try again");
            }
            catch (Exception ex) {
                System.out.println("Somethings Wrong Here");
            }



        }
    }

        /*
        spaceChecker("s s ",0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Calculation: ");
        boolean condition = true;
        while(condition) {
            String calculation = input.nextLine();
            int spaceCount=0;
            for(int x=0;x<calculation.length();x++){
                if(Character.toString(calculation.charAt(x))==" ") {
                    spaceCount++;

                }
                System.out.println(x);
            }
            if(spaceCount==2){
                condition=false;
                input = new Scanner(calculation);
            }
            else System.out.println("Calculation String needs two spaces");
            System.out.println(spaceCount);
        }


        int num1 = input.nextInt();
        String operator= input.next();
        int num2=input.nextInt();


        int answer = 0;
        switch(operator){
            case "+":answer=num1+num2;break;
            case "-":answer=num1-num2;break;
            case "*":answer=num1*num2;break;
            case "/":answer=num1/num2;break;
        }
        System.out.println(answer);
    }
    }
    */

