import java.util.Scanner;
 import javax.swing.JOptionPane;
 	
 public class RestaurantBill
 {
		
 	public static void main(String [] args)
 	{
 		
 		Scanner keyboard = new Scanner(System.in); 
 		
 		//ask for charge from the user
 		System.out.println("What is the charge for your meal?");
 		double charge = keyboard.nextDouble();
 			
 		double tipRate = 0.15;
 		double tipAmount;
 		double grandTotal;
 		double food = 30.00;
 		
 	
 		//calculate the charge and the tip
 		tipAmount = charge * tipRate;
 	
 				
 		if (charge <= food)
 			tipAmount = 5.00;
 		else
 			tipRate = 0.15;
 		
 		grandTotal = charge + tipAmount;
 		
 		System.out.println("The gratuity is $" + tipAmount + " and the total bill is $" + grandTotal);
 		
 			
 	}
 }