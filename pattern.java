import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1-i;j>=1;j--)
				System.out.print(" ");
			for(int k=0;k<2*i+1;k++)
				System.out.print("*");
			for(int j=n-i-1;j>=1;j--)
			System.out.print(" ");
			System.out.println();
		}
		
		
		for(int i=1;i<2*n;i++)
		{
			for(int j=1;j<2*n;j++)
			{
				if(i==1||j==1||i==j||i==(2*n-1)||j==(2*n-1)||(i+j)==2*n)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=0;k<(n*2-1)-2*i;k++)
				System.out.print("*");
			for(int j=0;j<i;j++)
			System.out.print(" ");
			System.out.println();
		}
		
	
		
		
	}

}
