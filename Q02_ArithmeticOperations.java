// Lab Sheet 1 - Q2: Arithmetic operations on two integers
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ArithmeticOperationsProgram {
    void run(Scanner sc) {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        if (b != 0) {
            System.out.println("Division       : " + (a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division and modulus not possible (divide by zero).");
        }
    }
}

public class Q02_ArithmeticOperations {
    public static void main(String[] args) {
        ArithmeticOperationsProgram program = new ArithmeticOperationsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
