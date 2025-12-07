class A
{
	 void dis()
	 {
		 System.out.println("hello ");
	 }
}
class B extends A
{
        void dis()
	 {
		 System.out.println("hello everyone ");
	 }	
}
class dispatch
{
	  public static void main(String arg[])
	  {
		  A a=new A();
		  a.dis();
		  a=new B();
		  a.dis();
	  }
}