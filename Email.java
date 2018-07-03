package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="amazon.com";
	//constructor to receive name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//email creation
		//System.out.println("EMAIL ID:"+email);
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		this.department=setDepartment();//call a method to receive department
		//System.out.println("DEPARTMENT :"+this.department);
		//comment
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("PASSWORD :"+this.password);
		//combining elements to join email
		email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+companySuffix;
		System.out.println("Your Email is :"+email);
	}
	//ask for department
	public String getDepartment() {
		return department;
	}
	private String setDepartment() {
		System.out.println("ENTER THE DEPARTMENT: \n1.SALES\n2.DEVELOPMENT\n3.ACCOUNTING\n0.NONE\n");
		Scanner sc=new Scanner(System.in);
		int depChoice=sc.nextInt();
		if(depChoice==1)
			return "SALES";
		else if(depChoice==2)
			return "DEVELOPMENT";
		else if(depChoice==3)
			return "ACCOUNTING";
		else return "";
		
	}
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setmailboxCapacity(int l)
	{
		this.mailboxCapacity=l;
	}
	public void setalternateEmail(String s)
	{
		this.alternateEmail=s;
	}
	public void changepassword(String s)
	{
		this.password=s;
	}
	public int getmailboxCapacity()
	{
		return mailboxCapacity;
	}
	public String getalternateEmail()
	{
		return alternateEmail;
	}
	
	public String getchangepassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		return "Display Name :"+firstName+lastName
				+"\n"+"Company Email: "+email+
				"\n"+"MAilBoxCapacity: "+mailboxCapacity+"mb";
	}
	//private String 
}