class Frog{
	private int a;
	private String s;
	Frog(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	public String toString()
	{
		return String.format("%s: %d",s,a);
	}
}
public class tutorial {

	public static void main(String[] args) {

		Frog f=new Frog(1,"Freddy");
		System.out.println(f);
		int i=Integer.parseInt("100001010",2);
		System.out.println(i);
	}

}
