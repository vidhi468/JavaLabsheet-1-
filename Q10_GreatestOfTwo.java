// Lab Sheet 1 - Q10: Greatest of two numbers using if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class GreatestOfTwoProgram {
    void run(Scanner sc) {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both numbers are equal");
    }
}

public class Q10_GreatestOfTwo {
    public static void main(String[] args) {
        GreatestOfTwoProgram program = new GreatestOfTwoProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
