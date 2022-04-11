import java.util.Scanner;
class Sbiank{
	final int balanceAmount=5000;
	public void withdrawAmount(int wa) {
		if(wa<5000) {
			System.out.println("you can withdraw");
		}
			else {
				System.out.println("not able to withdraw");
			}
		}
	}
public class BankMain {
	
	public static void main (String[] args) {
		
	int wamount;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the amount to withdraw");
	wamount=sc.nextInt();
	SbiBank sob = new SbiBank();
	sob.withdrawamount(wamount);
	}

}
