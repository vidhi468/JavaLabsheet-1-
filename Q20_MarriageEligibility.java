// Lab Sheet 1 - Q20: Marriage eligibility (male >= 21, female >= 18) using nested if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class MarriageEligibilityProgram {
    void run(Scanner sc) {
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char g = Character.toUpperCase(sc.next().charAt(0));
        if (g == 'M') {
            if (age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else if (g == 'F') {
            if (age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage");
        } else {
            System.out.println("Invalid gender entered.");
        }
    }
}

public class Q20_MarriageEligibility {
    public static void main(String[] args) {
        MarriageEligibilityProgram program = new MarriageEligibilityProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
