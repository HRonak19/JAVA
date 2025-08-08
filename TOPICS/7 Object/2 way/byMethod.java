// by Method object

class byMethod {

    void insert (int Rno,String name) {
        System.out.print(Rno);
        System.out.print(name);
    }
    public static void main (String[] args) {

        byMethod BM = new byMethod();

            BM.insert(17,"Ronak");
    }
}