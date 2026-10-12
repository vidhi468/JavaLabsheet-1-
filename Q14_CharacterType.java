// Lab Sheet 1 - Q14: Digit, uppercase, lowercase or special character
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CharacterTypeProgram {
    void run(Scanner sc) {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");
    }
}

public class Q14_CharacterType {
    public static void main(String[] args) {
        CharacterTypeProgram program = new CharacterTypeProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
