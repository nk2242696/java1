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
class prac12 {
	public static void main(String[] args) {
		X i = new X(10);
		X j = new X(20);
		X.swap(i.x,j.x);
		System.out.println("i = " + i.x + ", j = " + j.x);
	}
}