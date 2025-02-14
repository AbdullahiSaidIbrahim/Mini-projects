/**
 * 
 */
package Classwork;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner myScan = new Scanner (System.in);
		 int numMonths;
		 final double INTREST_RATE=0.06;
		 
		 
		 
		 System.out.println(" Please enter the number of months you want to compound intrest");
		  numMonths = myScan.nextInt();
		  
		  double startingbal;
		   System.out.println("Please enter your starting balance");
		   startingbal= myScan.nextDouble();
		   
		   
		   for(int i=0; i<numMonths;i++);{
			   startingbal=startingbal * INTREST_RATE + startingbal;
			   
		   }
				
		   System.out.println("After " + numMonths + " you would have $" + startingbal);
		
		   
		  /* Scanner myScan = new Scanner (System.in);
		   int numberStart;
		   int ignoreMultiples;
		   
		   numberStart= myScan.nextInt();
		   ignoreMultiples = myScan.nextInt();
		   
		   
		   for (int start = numberStart; start >0;start++);
		        if (start % ignoreMultiples ==0) {
		        	continue;
		        	
		        }
		        System.out.println("number; " +start);*/
		        
		
		
		
		
		    
		      
		

		
				
		   
		   

		   
		   
		   
		   
		   

	}

}
