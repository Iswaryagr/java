package threadproject;
class ThreadA extends Thread{
	int total;
	public void run() {
		for(int i=1;i<=10;i++) {
			total=total+i;
		}
	}
}
public class WaitNotifyExMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println(Thread.currentThread());
ThreadA ob =new ThreadA();
ob.start();
System.out.println("after start");
synchronized(ob) {
	ob.wait();
	System.out.println("sum="+ob.total);//main 0
}
	}

}
