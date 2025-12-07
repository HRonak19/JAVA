import java.util.*;
class account
{
	Scanner sc=new Scanner(System.in);
	double acc_no;
	String acc_type,holder_name;
	void getdata()
	{
		System.out.println("ENTER ACCOUNT HOLDER NAME=");
		holder_name=sc.nextLine();
		System.out.println("ENTER ACCOUNT NUMBER=");
		acc_no=sc.nextDouble();
		sc.nextLine();
		System.out.println("ENTER ACCOUNT TYPE SAVING OR CURRENT?=");
		acc_type=sc.nextLine();
		
	}
	void display()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(" ACCOUNT HOLDER NAME="+holder_name);
		System.out.println(" ACCOUNT NUMBER="+acc_no);
		System.out.println(" ACCOUNT TYPE SAVING OR CURRENT?="+acc_type);
	}
}
class current_account extends account
{
	 int balance,minimum;
	 void getdata1()
	 {
		 System.out.println("ACCOUNT BALANCE=");
		 balance=sc.nextInt();
		 System.out.println("MINIMUM BALANCE=");
		 minimum=sc.nextInt();
	 }
	 void display1()
	 {
		 System.out.println("ACCOUNT BALANCE="+balance);
		 System.out.println("MINIMUM BALANCE="+minimum);
	 }
}
class saving_account extends account
{
	int balance1,minimum1;
	 void getdata2()
	 {
		 System.out.println("ACCOUNT BALANCE=");
		 balance1=sc.nextInt();
		 System.out.println("MINIMUM BALANCE=");
		 minimum1=sc.nextInt();
	 }
	 void display2()
	 {
		 System.out.println("ACCOUNT BALANCE="+balance1);
		 System.out.println("MINIMUM BALANCE="+minimum1);
	 }
}
class Q8
{
	    public static void main(String arg[])
		{
			current_account obj=new current_account();
			saving_account obj1=new saving_account();
			obj.getdata();
			obj.getdata1();
			obj1.getdata();
			obj1.getdata2();
			
			obj.display();
			obj.display1();
			obj1.display();
			obj1.display2();
		}
}