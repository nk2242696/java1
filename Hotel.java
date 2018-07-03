import java.util.Scanner;

class Hotel1{
	protected int rating;
	protected int week_day_regular;
	protected int weekend_day_regular;
	protected int week_day_loyal;
	protected int weekend_day_loyal;
	
}
class Lakewood extends Hotel1{
	Lakewood(int r,int wr,int wl,int weekendr,int weekendl)
	{
		rating =r;
		week_day_regular=wr;
		weekend_day_regular=weekendr;
		week_day_loyal=wl;
		weekend_day_loyal=weekendl;
	}
}
class Bridgewood extends Hotel1{
	Bridgewood(int r,int wr,int wl,int weekendr,int weekendl)
	{
		rating =r;
		week_day_regular=wr;
		weekend_day_regular=weekendr;
		week_day_loyal=wl;
		weekend_day_loyal=weekendl;
	}
}
class Ridgewood extends Hotel1{
	Ridgewood(int r,int wr,int wl,int weekendr,int weekendl)
	{
		rating =r;
		week_day_regular=wr;
		weekend_day_regular=weekendr;
		week_day_loyal=wl;
		weekend_day_loyal=weekendl;
	}
}
public class Hotel {

	public static void function1 ( String s,int weekdays,int weekenddays)
	{
		int l1=0;
		int b1=0;
		int r1=0;
		Lakewood l=new Lakewood(3,110,80,90,80);
		Bridgewood b=new Bridgewood(4,160,110,60,50);
		Ridgewood d=new Ridgewood(5,220,100,150,40);
		if(s.compareTo("Regular")==0)
		{
			l1+=l.week_day_regular*weekdays+l.weekend_day_regular*weekenddays;
			b1+=b.week_day_regular*weekdays+b.weekend_day_regular*weekenddays;
			r1+=d.week_day_regular*weekdays+d.weekend_day_regular*weekenddays;
			int a=Math.min(Math.min(l1,b1), r1);
			if(a==l1)
				System.out.println("Lakewood "+l1);
			if(a==b1)
				System.out.println("Bridgewood "+b1);
			if(a==r1)
				System.out.println("Ridgewood "+r1);
		}
		if(s.compareTo("Rewards")==0)
		{
			l1+=l.week_day_loyal*weekdays+l.weekend_day_loyal*weekenddays;
			b1+=b.week_day_loyal*weekdays+b.weekend_day_loyal*weekenddays;
			r1+=d.week_day_loyal*weekdays+d.weekend_day_loyal*weekenddays;
			int a=Math.min(Math.min(l1,b1), r1);
			if(a==l1)
				System.out.println("Lakewood "+l1);
			if(a==b1)
				System.out.println("Bridgewood "+b1);
			if(a==r1)
				System.out.println("Ridgewood "+r1);
		}
		
	}
	public static void main(String[] args) {
		Lakewood l=new Lakewood(3,110,80,90,80);
		Bridgewood b=new Bridgewood(4,160,110,60,50);
		Ridgewood d=new Ridgewood(5,220,100,150,40);
		System.out.println("Enter no of queries");
		Hotel h=new Hotel();
		
		Scanner sc=new Scanner(System.in);
			int t;
			t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				String str;
				str=sc.next();
				int wd=sc.nextInt();
				int wkd=sc.nextInt();
				function1(str,wd,wkd);
				}
			
			
	}

}
