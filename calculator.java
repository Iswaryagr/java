import java.util.Scanner;

public class calculator {

    float a,b;
   int choice;
   Scanner sc =new Scanner(System.in);

	System.out.println("enter the a value");
	a=sc.nextFloat();
	System.out.println("enter the number b value");
  b=sc.nextFloat();
	System.out.println("1 addition");
	System.out.println("2 subraction");
	System.out.println("3 multiplication");
	System.out.println("4 division");
	System.out.println("enter your choice");
	choice=sc.nextInt();
  switch(choice)
  {
  case 1: 
  float add=a+b;
  System.out.println("addition is"+add);
  	break;
  	
  case 2: 
  float sub=a-b;
  	break;
  case 3: 
  	float mul=a*b;
  	break;
  case 4: 
  float	divi=a/b;
  	break;
  	default:
  		System.out.println("invalid data");
}



}
