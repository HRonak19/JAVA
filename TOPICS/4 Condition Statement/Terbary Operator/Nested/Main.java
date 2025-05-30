public class Main{
    public static void main(String[] args) {
        int marks = 75;

        String grade = (marks >= 90) ? "A" :
                       (marks >= 80) ? "B" :
                       (marks >= 70) ? "C" : "Fail";

        System.out.println("Grade: " + grade);
    }
}
