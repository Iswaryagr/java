import java.util.Scanner;

public class twonum {
		public static void main(String[] args) 
		{
			
			      int One, Two, largest;
			      Scanner scan = new Scanner(System.in);
			      
			      System.out.print("Enter the First Number: ");
			      One = scan.nextInt();
			      System.out.print("Enter the Second Number: ");
			      Two = scan.nextInt();
			      
			      if(One>Two)
			         largest = One;
			      else
			         largest = Two;
			      
			      System.out.println("\nLargest = " +largest);
			   }
			

		}




