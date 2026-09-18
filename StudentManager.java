import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully.");
    }

    public Student findStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        return null;
    }

    public void searchStudent(int studentId) {

        Student student = findStudent(studentId);

        if (student != null) {
            student.displayStudent();
        } 
        else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(int studentId,
                              String name,
                              String department,
                              String phone) {

        Student student = findStudent(studentId);

        if (student != null) {

            student.setName(name);
            student.setDepartment(department);
            student.setPhone(phone);

            System.out.println("Student updated successfully.");

        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int studentId) {

        Student student = findStudent(studentId);

        if (student != null) {

            students.remove(student);

            System.out.println("Student deleted successfully.");

        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }
}