package threadproject;
class MyThread extends Thread{
	public void run() {//method od thread class
		System.out.println("inside run"+this.isAlive());
		System.out.println("child thread"+Thread.currentThread());
	}
	void display() {
		System.out.println("display"+Thread.currentThread());
	}
	
}
public class MyMain {

	public static void main(String[] args) {
		System.out.println("JVM Thread"+Thread.currentThread());
		MyThread ob= new MyThread();
		MyThread ob1= new MyThread();
		//ob.display();//your control
		System.out.println("state"+ob.isAlive());//false
		ob.setName("FirstThread");
		ob1.setName("secondThread");
		ob.start();
		System.out.println("state"+ob1.isAlive());
		ob1.start();


	}

}
