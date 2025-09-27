class a {

    void sum () {
        System.out.print("First class ");
    }
}
class b extends a {

    @Override
    void sum() {
        System.out.println("Second class");
    }
}
class hello {

    public static void main(String args[]) {

        a b= new b();
        b.sum();
        a b1 = new b();
        b1.sum();
    }
}