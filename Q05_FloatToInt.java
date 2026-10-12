// Lab Sheet 1 - Q5: Explicit conversion of a floating-point number to int
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class FloatToIntProgram {
    void run(Scanner sc) {
        System.out.print("Enter a floating-point number: ");
        double d = sc.nextDouble();
        int i = (int) d;                       // explicit type casting: fractional part is dropped
        System.out.println("Original value  : " + d);
        System.out.println("Converted value : " + i);
    }
}

public class Q05_FloatToInt {
    public static void main(String[] args) {
        FloatToIntProgram program = new FloatToIntProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
