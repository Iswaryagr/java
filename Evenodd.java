import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("even number"+num);
		}
		{
		if(num%2!=0)
			System.out.println("odd number"+num);
		}
		}

	}


