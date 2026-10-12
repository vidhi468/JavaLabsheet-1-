// Lab Sheet 1 - Q16: Tax calculation based on income slabs
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class IncomeTaxProgram {
    void run(Scanner sc) {
        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        double tax;
        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 0.05;
        else if (salary <= 1000000)
            tax = salary * 0.20;
        else
            tax = salary * 0.30;
        System.out.println("Tax payable : " + tax);
    }
}

public class Q16_IncomeTax {
    public static void main(String[] args) {
        IncomeTaxProgram program = new IncomeTaxProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
