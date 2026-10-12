// Lab Sheet 1 - Q13: Positive, negative or zero using if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PositiveNegativeZeroProgram {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

public class Q13_PositiveNegativeZero {
    public static void main(String[] args) {
        PositiveNegativeZeroProgram program = new PositiveNegativeZeroProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
