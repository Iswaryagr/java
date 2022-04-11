package threadproject;
class Table1{
synchronized void print(int n) {
	for(int i=1;i<=10;i++) {
        System.out.println("n x"+i+"="+n*i);	
	}
}
public class TableMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table tb= new Table();
Thread t=new Thread() {
	public void run() {
		System.out.println("inside run");
		tb.print(8);
	}
	t.start();
	Thread t1=new Thread() {//annonymous class
			public void run() {
				System.out.println("inside run");
				tb.print(7);
			}	
			t.start();
new Thread() {//anonymous class
	public void run() {
		tb.print(9);
	}
.start();
	}
}
}
	}


