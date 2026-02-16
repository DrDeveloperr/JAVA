import java.util.InputMismatchException;
import java.util.Scanner;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("Student Name   : " + name);
        System.out.println("Marks Entered  : " + marks);
    }
}
class Grade {
    String calculate(int marks) {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }
}
public class Exp2 {
    void Student() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Marks out of 100: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException("Marks must be between 0 and 100.");

            Student s = new Student(name, marks);
            String grade = new Grade().calculate(marks);

            s.display();
            System.out.println("Grade: " + grade);
        }
        catch (InputMismatchException err) {
            System.out.println("Invalid input.");
        }
        catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
        finally {
            System.out.println("Evaluation completed.");
        }
        sc.close();
    }
    public static void main(String[] args) {
        new Exp2().Student();
    }
}
