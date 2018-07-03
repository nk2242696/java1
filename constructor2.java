
public class constructor2 {
	int i;
	String name;
	double sal;
	constructor2(int i,String name)
	{
		this.i=i;
		this.name=name;													//constructor chaining
		//this(67.9);
		//System.out.println(i+name);
	}
	constructor2(int i,String name,double sal)
	{
		this(i,name);
		this.sal=sal;
		//System.out.println(i+name+sal);
	}
	void display(){System.out.println(i+" "+name+" "+sal);}  
	public static void main(String[] args) {

		constructor2 c=new constructor2(1,"rohan");
		c.display();
		constructor2 bu=new constructor2(2,"ramu",90.78);
		bu.display();
		//constructor2 b=new constructor2(89.0);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
