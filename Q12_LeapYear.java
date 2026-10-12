// Lab Sheet 1 - Q12: Leap year check using if-else
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class LeapYearProgram {
    void run(Scanner sc) {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }
}

public class Q12_LeapYear {
    public static void main(String[] args) {
        LeapYearProgram program = new LeapYearProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
