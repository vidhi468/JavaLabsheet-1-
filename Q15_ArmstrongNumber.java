// Lab Sheet 1 - Q15: Armstrong number check for a 3-digit number
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ArmstrongNumberProgram {
    void run(Scanner sc) {
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Not a 3-digit number.");
            return;
        }
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;             // last digit
            sum += digit * digit * digit;      // add its cube
            temp /= 10;                        // remove last digit
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }
}

public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumberProgram program = new ArmstrongNumberProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
