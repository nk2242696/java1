import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s;
			s=sc.next();
			for(int j=0;j<s.length()/2;j+=2)
				System.out.print(s.charAt(j));
			System.out.println();
		}
	}

}
