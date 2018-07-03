import java.util.Scanner;

class Aaa implements Runnable{
 
	public int n;
	String str;
	static int  num=1;
	int rem;
	static Object lock=new Object();
 
	Aaa(int rem,int n,String str)
	{
		this.rem=rem;
		this.n=n;
		this.str=str;
	}
 
	@Override
	public void run() {
		while (num<n) {
			synchronized (lock) {
				while (num%2!=rem) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
							System.out.println(str + " " + num);
						num++;
						lock.notifyAll();
				
				
			}
		}
	}
}
public class threading2 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		Aaa odd=new Aaa(1,n,"odd");
		Aaa even=new Aaa(0,n,"even");
 
		Thread t1=new Thread(odd);
		Thread t2=new Thread(even);
		
		t1.start();
		t2.start();
 
	}
}