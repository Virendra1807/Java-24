package HackerRankProblems;
// TCS NQT question
import java.util.ArrayList;
import java.util.Scanner;

class Stud {
    String name;
    String gender;
    int age;
    char grade;

    Stud(String name, String gender, int age, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        ArrayList<Stud> students = new ArrayList<>();

        // Accept data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender (Male/Female): ");
            String gender = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Grade (A/B/C): ");
            char grade = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            students.add(new Stud(name, gender, age, grade));
        }

        // Print names of students whose age is more than 20
        System.out.println("\nStudents whose age is more than 20:");
        for (Stud student : students) {
            if (student.age > 20) {
                System.out.println(student.name);
            }
        }

        // Print names of only female students whose grade is A
        System.out.println("\nFemale students whose grade is A:");
        for (Stud student : students) {
            if (student.gender.equalsIgnoreCase("female") && student.grade == 'A') {
                System.out.println(student.name);
            }
        }

        scanner.close();
    }
}
