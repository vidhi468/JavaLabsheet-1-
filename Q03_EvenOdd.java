// Lab Sheet 1 - Q3: Even or odd using modulus operator and if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class EvenOddProgram {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }
}

public class Q03_EvenOdd {
    public static void main(String[] args) {
        EvenOddProgram program = new EvenOddProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
