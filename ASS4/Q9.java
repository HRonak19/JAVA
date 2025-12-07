import java.util.*;
class vehical
{
	Scanner sc=new Scanner(System.in);
	String color,company_name;
	void getdata()
	{
		System.out.println("ENTER COMPANY NAME=");
		company_name=sc.nextLine();
		System.out.println("ENTER COLOR OF VEHICAL=");
		color=sc.nextLine();
	}
}
class bike extends vehical
{
	 int price;
	 void getdata1()
	 {
		 System.out.println("ENTER PRICE=");
		 price=sc.nextInt();
		
		 
	 }
	 void display()
	 {
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println(" COMPANY NAME="+company_name);
		 System.out.println(" COLOR OF VEHICAL="+color);
		 System.out.println("BIKE PRICE="+price);
	 }
	
}
class car extends vehical
{
	int price1;
	 void getdata2()
	 {
		 System.out.println("ENTER PRICE=");
		 price1=sc.nextInt();
		
		 
	 }
	 void display1()
	 {
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println(" COMPANY NAME="+company_name);
		 System.out.println(" COLOR OF VEHICAL="+color);
		 System.out.println("BIKE PRICE="+price1);
	 }
}
class Q9
{
	   public static void main(String arg[])
	   {
		   bike b=new bike();
		   car c=new car();
		   b.getdata();
		   b.getdata1();
		   
		   
		   c.getdata();
		   c.getdata2();
		   b.display();
		   c.display1();
	   }
}