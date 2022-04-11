package threadproject;
class Myclass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run method"+Thread.currentThread()+"i="+i);
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class My {
	public static void main (String[] args) {
		System.out.println("JVM Thread"+Thread.currentThread());
		Myclass ob1 = new Myclass();
		Myclass ob2 = new Myclass();
		ob1.setName("FirstThread");
		ob2.setName("secondThread");
		System.out.println("sttaus of firstthread"+ob1.isAlive());
		ob1.start();
		ob2.start();
}

}
