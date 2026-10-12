// Lab Sheet 1 - Q18: Prime number check using if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PrimeNumberProgram {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is NOT a Prime number");
    }
}

public class Q18_PrimeNumber {
    public static void main(String[] args) {
        PrimeNumberProgram program = new PrimeNumberProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
