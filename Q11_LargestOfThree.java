// Lab Sheet 1 - Q11: Largest of three numbers using nested if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class LargestOfThreeProgram {
    void run(Scanner sc) {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if (a >= b) {
            if (a >= c)
                largest = a;
            else
                largest = c;
        } else {
            if (b >= c)
                largest = b;
            else
                largest = c;
        }
        System.out.println("Largest number is " + largest);
    }
}

public class Q11_LargestOfThree {
    public static void main(String[] args) {
        LargestOfThreeProgram program = new LargestOfThreeProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
