/*Написати клас, який виконує роль бази студентів. Він повинен зберігати в собі фамілію та середній бал студента.
 Також в класі повинні бути реалізовані функції додавання, видалення студента та відображення списку студентів.*/
package task5;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentsDatabase {
    private static ArrayList<Student> students;
    private static Scanner input;
    private static boolean terminal;
    private static final String help = "Commands:\n" + //
            "add - for adding student\n" + //
            "del - for remove student\n" + //
            "show - for show students\n" + //
            "exit - for exit";

    static {
        students = new ArrayList<>();
        input = new Scanner(System.in);
        terminal = true;
    }

    public static void main(String[] args) {
        while (terminal) {
            System.out.println(help);
            System.out.print("Input please command: ");
            String command = input.next();
            switch (command) {
                case "add":
                    addStudent();
                    break;
                case "del":
                    removeStudent();
                    break;
                case "show":
                    showStudents();
                    break;
                case "exit":
                    terminal = false;
                    break;
                default:
                    System.out.println("Error! Not exist command " + command);
                    break;
            }
        }
    }

    private static void addStudent() {
        String lastName = null;
        int gpa = 0;
        while (gpa == 0 && lastName == null) {
            System.out.print("Input please last name student: ");
            lastName = input.next();
            System.out.print("Input please GPA student: ");
            gpa = input.nextInt();
        }
        Student student = new Student(lastName, gpa);
        students.add(student);
    }

    private static void removeStudent() {
        System.out.print("Input please last name student: ");
        String lastName = input.next();
        boolean existStudent = false;
        for (Student student : students) {
            if (student.getLastName().equals(lastName)) {
                students.remove(student);
                existStudent = true;
                System.out.println("student " + lastName + " deleted");
                break;
            }
        }
        if (!existStudent) {System.out.println("student " + lastName + " not exist");}
    }

    private static void showStudents() {
        for (Student student : students) {
            System.out.println(student.getLastName() + " - " + student.getGPA());
        }
    }
}
