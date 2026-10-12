// Lab Sheet 1 - Q7: Divisible by both 3 and 5 using logical operators
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class DivisibleBy3And5Program {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0)          // && : both conditions must be true
            System.out.println(n + " is divisible by both 3 and 5");
        else
            System.out.println(n + " is NOT divisible by both 3 and 5");
    }
}

public class Q07_DivisibleBy3And5 {
    public static void main(String[] args) {
        DivisibleBy3And5Program program = new DivisibleBy3And5Program(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
