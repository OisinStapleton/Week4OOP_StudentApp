package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Prompting user for number of entries, stores this number in int count
        System.out.print("How many students would you like to add?: ");
        int count = sc.nextInt();
        sc.nextLine();

        // Initializing our loop starting point to zero
        int i = 0;

        // Re- prompts user until number entered from user is met
        while (i < count){
            System.out.print("Please enter student name: ");
            String name = sc.nextLine();
            System.out.print("Please enter studentID: ");
            String studentID = sc.nextLine();
            System.out.print("Please enter student course: ");
            String course = sc.nextLine();

            //Storage of new student
            Student student = new Student(name,studentID,course);

            students.add(student);
            //Incrementing i until loop condition is false
            i++;

        }
        // After Loop completion display is shown
        System.out.println("Student List:");
        for (Student s : students){
            System.out.println(s);
        }
    }
}