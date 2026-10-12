// Lab Sheet 1 - Q9: Total, percentage and pass/fail (>= 40% in all subjects)
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class MarksResultProgram {
    void run(Scanner sc) {
        System.out.print("Enter marks of three subjects (out of 100): ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double total = m1 + m2 + m3;
        double percentage = total / 3;
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result     : PASS");
        else
            System.out.println("Result     : FAIL");
    }
}

public class Q09_MarksResult {
    public static void main(String[] args) {
        MarksResultProgram program = new MarksResultProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
