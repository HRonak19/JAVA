import java.util.*;
class svgc
{
	Scanner sc=new Scanner(System.in);
	int stud_id;
	String stud_name;
	void getdata()
	{
		System.out.println("ENTER STUD ID=");
		stud_id=sc.nextInt();
		sc.nextLine();
		System.out.println("ENTER STUD NAME=");
		stud_name=sc.nextLine();
		
	}
	
}
class bca extends svgc
{
	 int sem;
	 char div;
	 void getdata1()
	 {
		 System.out.println("ENTER STUD SEM=");
		 sem=sc.nextInt();
		 System.out.println("ENTER STUD DIV=");
		 div=sc.next().charAt(0);
	 }
	 void putdata1()
	 {
		 System.out.println();
		 System.out.println();
		 System.out.println(":BCA INFORMATION:");
		 System.out.println("STUD ID="+stud_id);	
	    System.out.println("STUD NAME="+stud_name);
		 System.out.println(" STUD SEM="+sem);
		 System.out.println(" STUD DIV="+div);
	 }
}
class msw extends svgc
{
	int sem1;
	 char div1;
	 void getdata2()
	 {
		 System.out.println("ENTER STUD SEM=");
		 sem1=sc.nextInt();
		 System.out.println("ENTER STUD DIV=");
		 div1=sc.next().charAt(0);
	 }
	 void putdata2()
	 {
		   System.out.println();
		 System.out.println();
		 System.out.println(":MSW INFORMATION:");
		 System.out.println("STUD ID="+stud_id);	
	    System.out.println("STUD NAME="+stud_name);
		 System.out.println(" STUD SEM="+sem1);
		 System.out.println(" STUD DIV="+div1);
	 }
}
class bhms extends svgc
{
	int sem2;
	 char div2;
	 void getdata3()
	 {
		 System.out.println("ENTER STUD SEM=");
		 sem2=sc.nextInt();
		 System.out.println("ENTER STUD DIV=");
		 div2=sc.next().charAt(0);
	 }
	 void putdata3()
	 {
		  System.out.println();
		 System.out.println();
		 System.out.println(":BHMS INFORMATION:");
		 System.out.println("STUD ID="+stud_id);	
	     System.out.println("STUD NAME="+stud_name);
		 System.out.println(" STUD SEM="+sem2);
		 System.out.println(" STUD DIV="+div2);
	 }
}
class p5
{
	   public static void main(String arg[])
	   {
		   bca obj=new bca();
		   msw obj1=new msw();
		   bhms obj2=new bhms();
		   obj.getdata();
		   obj.getdata1();
		   obj1.getdata();
		   obj1.getdata2();
		   obj2.getdata();
		   obj2.getdata3();
		   
		   
		   obj.putdata1();
		   obj1.putdata2();
		   obj2.putdata3();
	   }
}