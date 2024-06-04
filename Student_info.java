import java.util.*;
import java.*;
import java.util.Scanner;

public class student_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        Student name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter student ID: ");
        Student id = scanner.nextLine();
        System.out.print("Enter student section: ");
        Student section = scanner.nextLine();
        System.out.println("Student Details:\nName: " + name + "\nAge: " + age + "\nID: " + id + "\nMajor: " + major);
        scanner.close();
    }
}

