package threadproject;
class MyClass1 implements Runnable{

	@Override
	public void run() {
		System.out.println("run method");
		
	}
}
public class MainRunnableInterface {
	public static void main(String[] args) {
		MyClass1  ob = new MyClass1();
		Thread tob = new Thread(ob);
		MyClass1  ob1 = new MyClass1();
		Thread tob1 = new Thread(ob1);
		//tob.setName("first");
		//tob1.setName("second");
		tob.start();
		tob1.start();
	}
}