
public class practice {
	static int k=100;
	void fun()
	{
		System.out.println("hello");
	}
	void fun2()
	{
		this.fun();
		this.k=50;
		System.out.println("hello2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice p=new practice();
		p.fun2();
		System.out.println(k);
	}

}
