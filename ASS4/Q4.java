import java.util.*;
class car
{ 
    Scanner sc=new Scanner(System.in);
	String car_name,car_no,model;
	int year;
	
	
}
class car2 extends car
{
	  void getdata()
	{
		System.out.println("ENTER CAR NAME=");
		car_name=sc.nextLine();
		System.out.println("ENTER CAR MODEL=");
		model=sc.nextLine();
		System.out.println("ENTER CAR NO=");
		car_no=sc.nextLine();
		System.out.println("ENETR CAR YEAR=");
		year=sc.nextInt();
		
		
	}

}
class car1 extends car2
{
		
	void putdata()
	{
		 System.out.println();
		 System.out.println();
		System.out.println("CAR NAME="+car_name);
		System.out.println("CAR MODEL="+model);
		System.out.println(" CAR NO="+car_no);
		System.out.println("CAR YEAR="+year);
		
	}
	
}
class Q4
{
	public static void main(String arg[])
	{
		car1 obj=new car1();
		obj.getdata();
		obj.putdata();
	}
}