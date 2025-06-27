public class Main{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i == 5) {
                continue;  // Skip this iteration
            }
            System.out.println("i = " + i);
        }
    }
}
