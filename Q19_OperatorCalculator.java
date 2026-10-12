// Lab Sheet 1 - Q19: Valid operator check and calculation on two numbers
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class OperatorCalculatorProgram {
    void run(Scanner sc) {
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (op == '+')
                System.out.println("Result: " + (a + b));
            else if (op == '-')
                System.out.println("Result: " + (a - b));
            else if (op == '*')
                System.out.println("Result: " + (a * b));
            else {
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Division by zero is not possible.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}

public class Q19_OperatorCalculator {
    public static void main(String[] args) {
        OperatorCalculatorProgram program = new OperatorCalculatorProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
