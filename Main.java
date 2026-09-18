import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        int studentId = 101;

        while (true) {

            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Add Course & Marks");
            System.out.println("7. Display Result");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    if (!Utils.isValidName(name)) {
                        System.out.println("Invalid name.");
                        break;
                    }

                    if (!Utils.isValidAge(age)) {
                        System.out.println("Invalid age.");
                        break;
                    }

                    if (!Utils.isValidPhone(phone)) {
                        System.out.println("Invalid phone number.");
                        break;
                    }

                    Student student =
                        new Student(
                            studentId++,
                            name,
                            age,
                            department,
                            phone
                        );

                    manager.addStudent(student);

                    break;

                case 2:

                    System.out.print("Enter student ID: ");
                    int searchId = sc.nextInt();

                    manager.searchStudent(searchId);

                    break;

                case 3:

                    System.out.print("Enter student ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new department: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();

                    manager.updateStudent(
                        updateId,
                        newName,
                        newDepartment,
                        newPhone
                    );

                    break;

                case 4:

                    System.out.print("Enter student ID: ");
                    int deleteId = sc.nextInt();

                    manager.deleteStudent(deleteId);

                    break;

                case 5:

                    manager.displayAllStudents();

                    break;

                case 6:

                    System.out.print("Enter student ID: ");
                    int courseStudentId = sc.nextInt();
                    sc.nextLine();

                    Student courseStudent =
                        manager.findStudent(courseStudentId);

                    if (courseStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Enter course name: ");
                    String courseName = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    if (!Utils.isValidMarks(marks)) {
                        System.out.println("Invalid marks.");
                        break;
                    }

                    Course course =
                        new Course(courseName, marks);

                    System.out.println("Course added successfully.");

                    break;

                case 7:

                    System.out.println(
                        "Result module can be connected to student records."
                    );

                    break;

                case 8:

                    System.out.println(
                        "Thank you for using Student Management System."
                    );

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}