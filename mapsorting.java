import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mapsorting {

	public static void main(String[] args) {

		Map<Integer,Integer>  m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int t;
		System.out.println("Enter the number of values");
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			m.put(i,sc.nextInt());
		}
		Collections.sort(m);
	}

}
