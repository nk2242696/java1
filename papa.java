import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class papa {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> s=new ArrayList<>();
	int t;
	System.out.println("Enter no of strings you want to enter");
	t=sc.nextInt();
	while(t-->=0)
	{
		String s1=sc.next();
		s.add(s1);
	}
	Collections.sort(s);
	 int count1=1;
	 int k=s.size();
	for(int i=0;i<k-1;i++)
	{
		
		if(s.get(i).compareTo(s.get(i+1))==0)
		{
			count1++;
		}
		else
		{
			System.out.println(s.get(i)+":"+count1);
			count1=1;
		}
	}
	if(s.get(k-2)==s.get(k-2))
		System.out.print(s.get(k-1)+":"+count1++);
	else
		System.out.print(s.get(k-1)+":"+1);

}
}
