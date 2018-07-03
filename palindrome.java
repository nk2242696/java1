import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int arr[]=new int[26];
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
					arr[s.charAt(i)-'A']++;
				else
					if(s.charAt(i)>='a'&&s.charAt(i)<='z')
						arr[s.charAt(i)-'a']++;
			}
			int c=0;
			for(int i=0;i<26;i++)
			{
				if(arr[i]%2==0)
					continue;
				else
					c++;
			}
			if(c==1||c==0)
				System.out.println("Pallindrome");
			else
				System.out.println("Not Pallindrome");
	}

}
