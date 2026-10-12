// Lab Sheet 1 - Q6: ASCII value of a character
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class AsciiValueProgram {
    void run(Scanner sc) {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "' is " + (int) ch);
    }
}

public class Q06_AsciiValue {
    public static void main(String[] args) {
        AsciiValueProgram program = new AsciiValueProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
