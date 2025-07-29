class twoD {

    public static void main (String[] args) {

        int[][] a = new int[3][3];

          a[0][0] = 0;
          a[0][1] = 1;
          a[0][2] = 0;

          a[1][0] = 0;
          a[1][1] = 1;
          a[1][2] = 0;

          for(int i = 0; i<3; i++) {

                for(int j = 0; j<3; j++) {

                    System.out.print(a[i][j]+" ");
                }
            System.out.println();
          }

    }
}