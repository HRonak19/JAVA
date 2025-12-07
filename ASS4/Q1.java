import java.util.*;
class emp
{
	 Scanner sc=new Scanner(System.in);
	 int emp_no,salary;
	 String emp_name;
	 void getdata()
	 {
		 System.out.println("ENTER EMP NUMBER=");
		 emp_no=sc.nextInt();
		 sc.nextLine();
		 System.out.println("ENTER EMP NAME=");
		 emp_name=sc.nextLine();
		 System.out.println("ENTER EMP SALARY=");
		 salary=sc.nextInt();
	 }
}
class dept extends emp
{
	int dept_code;
	String name;
	void getdata1()
	{
		System.out.println("ENTER dept number=");
		dept_code=sc.nextInt();
		sc.nextLine();
		System.out.println("ENTER dept NAME=");
		name=sc.nextLine();
		
	}
	void display()
	{
		System.out.println();
		System.out.println();
		System.out.println("EMP NUMBER="+emp_no);
		System.out.println("EMP NAME="+emp_name);
		System.out.println("EMP SALARY="+salary);
		System.out.println("DEPT NUMBER="+dept_code);
		System.out.println("DEPT NAME="+name);
		
	}
	
	
}
class Q1
{
	public static void main(String arg[])
	{
		dept obj=new dept();
		obj.getdata();
		obj.getdata1();
		obj.display();
	}
}