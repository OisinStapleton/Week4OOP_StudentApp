package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter?: ");
        int count = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < count){
            System.out.print("Please enter student name: ");
            String name = sc.nextLine();
            System.out.print("Please enter student email: ");
            String email = sc.nextLine();
            System.out.print("Please enter student course: ");
            String course = sc.nextLine();

            Student student = new Student(name,email,course);

            students.add(student);
            i++;

        }
        System.out.println("Student List:");
        for (Student s : students){
            System.out.println(s);
        }
    }
}