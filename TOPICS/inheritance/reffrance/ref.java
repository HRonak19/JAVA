class a {

    void method() {

        System.out.println("A....");
    }
}
class b extends a {

    void method() {

        System.out.print("B....");
    }
}
class ref {

    public static void main (String []args) {

        a call = new a();

            call.method();
        
        call = new b();

           call.method();
    }
}