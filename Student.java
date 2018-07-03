package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse=600;
	private static int id=1001; 
	
	Scanner sc=new Scanner(System.in);
	public Student()
	{
		System.out.println("Enter Student First Name: ");
		this.firstName=sc.next();
		System.out.println("Enter Student Last Name: ");
		this.lastName=sc.next();
		System.out.println("Enter Student GradeYear \n1.Freshmen \n2.Sophomore \n3.Junior \n4.Senior ");
		this.gradeYear=sc.nextInt();
		setStudentId();
		System.out.println(firstName+" "+lastName+" "+gradeYear+studentId);
		
		}
	private void setStudentId()
	{
		id++;
		studentId=gradeYear+""+id;
	}
	
}
