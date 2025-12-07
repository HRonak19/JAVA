import java.util.*;
class student
{
	 Scanner sc=new Scanner(System.in);
	int rno,mark1,mark2,mark3;
	String name;
	void getdata()
	{
		System.out.println("ENTER THE ROLL NUMBER=");
		rno=sc.nextInt();
		sc.nextLine();
		System.out.println("ENTER THE STUDENT NAME=");
		name=sc.nextLine();
		System.out.println("ENTER MARK1=");
		mark1=sc.nextInt();
		System.out.println("ENTER MARK2=");
		mark2=sc.nextInt();
		System.out.println("ENTER MARK3=");
		mark3=sc.nextInt();
	}
}
class result extends student
{
	int total;
	float per;
	void process()
	{
		total=mark1+mark2+mark3;
		per=total/3;
	}
	void display()
	{
		System.out.println();
		System.out.println();
		System.out.println("STUDENT ROLL NUMBER="+rno);
		System.out.println("STUDENT NAME="+name);
		System.out.println("MARK1="+mark1);
		System.out.println("MARK2="+mark2);
		System.out.println("MARK3="+mark3);
		System.out.println("TOTAL OF MARK="+total);
		System.out.println("PERCENTAGE="+per);
		
	}
	
}
class Q2
{
	public static void main(String arg[])
	{
		result obj=new result();
		obj.getdata();
		obj.process();
		obj.display();
	}
}