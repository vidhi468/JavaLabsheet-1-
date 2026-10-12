// Lab Sheet 1 - Q4: Relational operators on two numbers
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class RelationalOperatorsProgram {
    void run(Scanner sc) {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " >  " + b + " : " + (a > b));
        System.out.println(a + " <  " + b + " : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
    }
}

public class Q04_RelationalOperators {
    public static void main(String[] args) {
        RelationalOperatorsProgram program = new RelationalOperatorsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
