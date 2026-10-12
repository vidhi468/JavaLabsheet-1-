// Lab Sheet 1 - Q17: Palindrome check using arithmetic operations and type casting
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PalindromeNumberProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        int reversed = (int) rev;              // explicit type casting from long to int
        if (n >= 0 && reversed == n)
            System.out.println(n + " is a Palindrome");
        else
            System.out.println(n + " is NOT a Palindrome");
    }
}

public class Q17_PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumberProgram program = new PalindromeNumberProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
