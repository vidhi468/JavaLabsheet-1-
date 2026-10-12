// Lab Sheet 1 - Q8: Vowel or consonant using if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class VowelConsonantProgram {
    void run(Scanner sc) {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet.");
            return;
        }
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
    }
}

public class Q08_VowelConsonant {
    public static void main(String[] args) {
        VowelConsonantProgram program = new VowelConsonantProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
