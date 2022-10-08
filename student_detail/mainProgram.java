import java.util.Scanner;

class StudentDetails {
    String student_name;
    int student_id;
    int student_age;
    int std;

    StudentDetails() {
        student_name = "Pooja";
        student_age = 16;
        student_id = 1;
        std = 10;

    }

    StudentDetails(String name, int age, int std, int id) {
        this.student_name = name;
        this.student_age = age;
        this.student_id = id;
        this.std = std;
    }

    public void DisplayStudent() {
        System.out.println("StudentDetails:\n" + "student name: " + student_name + "\nStudent age: " + student_age
                + "\nStudent id: " + student_id);
    }
}

public class mainProgram {
    public static void main(String[] args) {
        StudentDetails details = new StudentDetails();
        details.DisplayStudent();
    }
}