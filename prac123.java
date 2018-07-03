class X{
	int x;
	X(int a){
		x=a;
	}
	public static void swap(X i,X j) {
		X temp=new X(i.x);
	    temp.x=i.x;
		i.x = j.x;
		j.x= temp.x;
	}
	
	public static void swap(int i,int j) {
		X temp=new X(i);
	    temp.x=i;
		i = j;
		j= temp.x;
	}
}
class prac123 {
	public static void main(String[] args) {
		String d="Hello";
		System.out.println(d.hashCode());
		System.out.println("Hello".hashCode());
	}
}