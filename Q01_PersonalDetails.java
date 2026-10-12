// Lab Sheet 1 - Q1: Display name, age and college using variables of appropriate data types
// Name: Shanu Sharma | MCA III Semester

// Class that holds the logic of this question
class PersonalDetailsProgram {
    void run() {
        String name = "Shanu Sharma";          // String for text
        int age = 22;                          // int for whole numbers (change to your age)
        String college = "College of Smart Computing";
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
    }
}

public class Q01_PersonalDetails {
    public static void main(String[] args) {
        PersonalDetailsProgram program = new PersonalDetailsProgram(); // create an object of the class
        program.run();
    }
}
