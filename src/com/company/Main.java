package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        String id;
        String fullName;
        String gender;
        String birthYear;

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.print("Enter Id: ");
            id = scanner.nextLine();
            System.out.print("Full name: ");
            fullName = scanner.nextLine();
            System.out.print("Gender: ");
            gender = scanner.nextLine();
            System.out.print("Birth year: ");
            birthYear = scanner.nextLine();
            Student student = new Student(id, salutation(gender), fullName, gender, age(birthYear));
            students.add(student);
            System.out.print("Wants more student? (y/n)");
            choice = scanner.nextLine();
        } while (!choice.equals("n"));
        scanner.close();

        for(Student student: students) {
            System.out.println(student);
        }

    }

    public static String salutation(String gender) {
        gender = gender.toLowerCase();
        if (gender.equals("male")) {
            return "Mr.";
        }
        else {
            return "Ms.";
        }
    }

    public static int age(String birthYear) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - Integer.parseInt(birthYear);
    }
}
