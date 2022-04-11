import java.util.Scanner;

public class GradeStudent {
			public static void main (String[] args) {
			int num1,num2,num3;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter he first number");
			num1 = sc.nextInt();
			System.out.println("enter the second number");
			num2 = sc.nextInt();
			System.out.println("enter the third number");
			num3 = sc.nextInt();

			if(num1>num2 && num1>num3) {
				System.out.println(num1+"num1 is largest");
			}
			else if(num2>num1 && num2>num3){
				System.out.println(num2+"num2 is largest");
			}
			else if(num3>num1 && num3>num2) {
				System.out.println(num3+" num3 is largest");
			}
			else
				System.out.println("two are three numbers are equal");
					
		}
	}



