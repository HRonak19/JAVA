import java.util.*;
class first
{
	  Scanner sc=new Scanner(System.in);
	 int book_no;
	 String book_name;
	 void getdata()
	 {
		 System.out.println("ENTER BOOK NO=");
		 book_no=sc.nextInt();
		 sc.nextLine();
		 System.out.println("ENTER BOOK NAME=");
		 book_name=sc.nextLine();
	 }
}
class second extends first
{
	String author_name,year;
	void getdata1()
	{
		System.out.println("ENTER AUTHOR NAME=");
		author_name=sc.nextLine();
		System.out.println("ENTER PUBLISHER=");
		year=sc.nextLine();
	}
}
class third extends second
{
	void putdata()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("BOOK NO="+book_no);
		System.out.println("BOOK NAME="+book_name);
		System.out.println("AUTHOR NAME="+author_name);
		System.out.println("PUBLISHER="+year);
		
	}
}
class p3
{
	  public static void main(String arg[])
	  {
		  third obj=new third();
		  obj.getdata();
		  obj.getdata1();
		  obj.putdata();
	  }
}