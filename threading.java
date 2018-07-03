import java.util.Scanner;

class A implements Runnable{
	private int n;
	public A(int n) {
        this.n=n;
     }
	public void run()
	{
	for(int i=1;i<=n;i+=2)
	{
		System.out.println("Thread A printing odd   "+i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class B implements Runnable{
	private int n;
	public B(int n) {
        this.n =n;
     }
	public void run()
	{
	for(int i=2;i<=n;i+=2)
	{
		System.out.println("Thread B printing even  "+i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class threading {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer :");
		int n=sc.nextInt();
			Thread t1=new Thread(new A(n));
			Thread t2=new Thread(new B(n));
			t1.start();
			t2.start();
	}

}
