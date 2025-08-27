class over {

    int no;
    int rno;
    String name;

        over(int r, String n) {

            rno = r;
            name = n;
        }

        over(int i , int r , String n) {

            no = i;
            rno = r;
            name = n;
        }

        void display() {

            System.out.println(no+" "+rno+" "+name);
        }

        public static void main(String args[]) {

            over ov1 = new over(16,"Ronak");
            over ov2 = new over(2,17,"moke");

            ov1.display();
            ov2.display();
        }
}