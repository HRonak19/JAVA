import java.util.*;
class shape
{
	 double l,h,r=5.42;
	 Scanner sc=new Scanner(System.in);
	    void draw()
		{
			System.out.println("ENTER l=");
			l=sc.nextDouble();
			System.out.println("ENTER h=");
			h=sc.nextDouble();		
		}
}
class circle extends shape
{
	    double area;
	    void draw()
        {		
			area=3.14*3.14*r;
			System.out.println();
			System.out.println();
			System.out.println("AREA OF CIRCLE="+area);
			System.out.println();
         }
}
class rectangle extends shape
{
	  double area1;
	  void draw()
	 {
			super.draw();	
			area1=l*h;
			System.out.println();
			System.out.println();
			System.out.println("AREA OF RECTANGLE="+area1);
			System.out.println();
	 }
}
class triangle extends shape
{
	  double area2;
	    void draw()
		{
			super.draw();	
			
			area2=0.5*l*h;
			System.out.println();
			System.out.println();
			System.out.println("AREA OF TRIANGLE="+area2);
		}
}
class Q7
{
	   public static void main(String arg[])
	   {
		   shape a=new shape();
		  
		   a=new circle();
		   a.draw();
		   a=new rectangle();
		   a.draw();
		   a=new triangle();
		   a.draw();
	   }
}