import java.text.NumberFormat;
import java.util.*;

public class CakeShop{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

// variables
int moreLayers, moreCandles;
int sentinel = 1;
int amount = 0;
int i = 0;
int totalPrice = 0;




System.out.println("Enter amount of cakes");
  while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer");
            scan.next();
        }
amount = scan.nextInt();

Cake[] cakes = new Cake[amount]; //array for the cake objects

while (sentinel != 0) { //sentinel set up
      if (i > amount - 1) { //breaks if goes out of bounds
        break;
      }
	  
	  //Entry Number
	  System.out.println("\nThis is entry number " + (i + 1));
	  
	  Cake cake = new Cake();
	  
	  //Cake Icing
	  System.out.println("Enter the icing you want for your cake");
	  while (!scan.hasNextLine()){
		System.out.println("Please enter a string");
		scan.next();
		}
        cake.icing = scan.next();
	 
	  //Cake shape
	  System.out.println("Enter the shape you want for your cake");
	  while (!scan.hasNextLine()){
		System.out.println("Please enter a string");
		scan.next();
		}
        cake.shape = scan.next();
	  
	  //Cake layers
	  System.out.println("Enter the number of layers you want for your cake");
        while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer (for layers)");
            scan.next();
        }
        cake.layers = scan.nextInt();
		
	  //Cake candles
	  System.out.println("Enter the number of candles you want");
	    while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer (for candles)");
            scan.next();
        }
        cake.candles = scan.nextInt();
		
	  //Cake size
	  System.out.println("Enter the size you want (1 - 6)");
        int val = scan.nextInt();
        
        while (val < 1 || val > 6) {
          System.out.println("Please enter an integer between 1 and 6");
          val = scan.nextInt();
        }
        cake.size = val;
	  
	  //Additional candles
	  System.out.println("Any additional candles?");
	    while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer (for additional candles)");
            scan.next();
        }
        moreCandles = scan.nextInt();
        cake.addCandles(moreCandles);
		
	  //Additional Layers
	  System.out.println("Any additional layers?");
	    while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer (for additional layers)");
            scan.next();
        }
        moreLayers = scan.nextInt();
        cake.addLayers(moreLayers);
	  
	  
	  //Price
	  cake.price();
	  
	  System.out.println();
	  
	  cakes[i] = cake; // stores cake objects
	  
	  
	  if (i < amount - 1) {   
          System.out.println("Enter 0 to quit, enter any other values to start next entry");// prompt user for sentinel value if it is not the last entry
          while (!scan.hasNextInt()) {
            System.out.println("Please enter an integer");
            scan.next();
        }
		  sentinel = scan.nextInt();
        }
		
		i++; // increases the count
	}
	
	
	// Array print
	  for (Cake cake : cakes) {  //enhanced for loop for printing the array all at once
        System.out.println();
        System.out.println(cake);
        }
		
	System.out.println();
      System.out.println("You have ordered "+ (amount) + " cake(s)");
	  
	  for (Cake cake : cakes) {  // Total price
        totalPrice += cake.price();
	  }
		
	 // Total price print
	 NumberFormat fmt = NumberFormat.getCurrencyInstance();
	  System.out.println("\nTotal price is " + fmt.format(totalPrice)); //prints out total price
	  
	
}	
}		
		
	  
	  
	  
	  