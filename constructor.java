
public class constructor {
	constructor()
	{
		this(8);
		System.out.println("Hello from default");
	}
	constructor(int t)
	{
		System.out.println("Hello from parameterized");
	}
	public static void main(String[] args) {

		constructor c=new constructor();
	}

}
//calling parameterized constructor from constructor;