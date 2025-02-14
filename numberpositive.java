/**
 
 */
package Classwork;


/**
 * 
 */
import java.util.Scanner;
public class numberpositive {

	
	public static void main(String[] args) {
		// create a scanner object to get input from the user
		
		Scanner scanner = new Scanner (System.in);
		
	
		
		//Ask the user for the first  number 
		System.out.print("Enter the first number");
	    int number1= scanner .nextInt();
	    
	    
	    
	    //write and compare 
	     if (number1> 0 ){
	    	 System.out.println("The number is greater than 0");
	    	 
	     } else if (number1<0) {
	    	 System.out.println("The number is negative");
	    	 
	     } else {
	    	 System.out.println("The number is zero");
	    	  
	     }
	   //Ask the User for the second number
		    System.out.print("Enter the second number");
		    int number2= scanner.nextInt();
		    
		    if (number2> 0 ){
		    	 System.out.println("The number is greater than 0");
		    	 
		     } else if (number2<0) {
		    	 System.out.println("The number is negative");
		    	 
		     } else {
		    	 System.out.println("The number is zero");
		     }
		    
		    // Ask the user for the third number
		    System.out.print("Enter the third number");
		    int number3=scanner.nextInt();
		    
		    if (number3> 0 ){
		    	 System.out.println("The number is greater than 0");
		    	 
		     } else if (number3<0) {
		    	 System.out.println("The number is negative");
		    	 
		     } else {
		    	 System.out.println("The number is zero");
		     }
		    // Determine the largestt number 
		    int largest = number1;//lets asssume number 1 is the largest 
		    
		    if (number2> largest) {
		    	largest=number2;
		    }
		    
		    if (number3> largest) {
		    	largest= number3;
		    }
		    
		    //print the largest number
		    System.out.println("The largest number is:"+largest);
		    	  
		   
		    
	     
	     
	     //close the scanner
	     scanner.close();
	    
	    
		
	}
	

	}

