import java.util.*;
class student
{
	  Scanner sc=new Scanner(System.in);
	  int rno;
	  String name;
	  void getdata()
	  {
		  System.out.println("ENTER STUDENT ROLL NO=");
		  rno=sc.nextInt();
		  sc.nextLine();
		  System.out.println("ENTER STUDENT NAME=");
		  name=sc.nextLine();
	  }
}
class mark extends student
{
	   int a[]=new  int[5];
	   int i;
	   void getdata1()
	   {
		   for(i=1;i<=3;i++)
		   {
			   System.out.println("ENTER MARK"+i+"=");
			   a[i]=sc.nextInt();
		   }
		   
	   }
	
}
class result extends mark
{
	   int total;
	   float per;
	   
	   void getdata2()
	   {
		   for(i=1;i<=3;i++)
		   {
			    total=a[i]+total;
		   }
		   per=total/3;
	   }
	   void putdata()
	   {
		   System.out.println();
		    System.out.println();
		   System.out.println("STUDENT ROLL NO="+rno);
		   System.out.println("STUDENT NAME="+name);
		    for(i=1;i<=3;i++)
		   {
			   System.out.println("MARK"+i+"="+a[i]);
			   
		   }
		   System.out.println("TOTAL="+total);
		   System.out.println("PER="+per);
	   }
	
}
class p6
{
	      public static void main(String arg[])
		  {
			  result obj=new result();
			  obj.getdata();
			  obj.getdata1();
			  obj.getdata2();
			  obj.putdata();
			  
		  }
}