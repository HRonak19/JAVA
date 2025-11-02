class sum {

    void add(int a, int b) {
        System.out.println(a+b);
    }
    void add(int a,int b,int c) {
        System.out.print(a+b+c);
    }
}
class Overloading  {

    public static void main(String []args) {

        sum s = new sum();

            s.add(10,20);
            s.add(10,20,30);
    }
}
