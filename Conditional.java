import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age");
		age= sc.nextInt();
		if(age>=18) {
			System.out.println(age+"is eligible for voting");
			if(age<18) {
			 System.out.println(age+"not eligible for voting");
			}
		}
		
	}

	}

