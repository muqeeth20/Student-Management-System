import java.util.ArrayList;

public class Result {

    private ArrayList<Course> courses;

    public Result() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {

        courses.add(course);

        System.out.println("Course added successfully.");
    }

    public double calculatePercentage() {

        if (courses.isEmpty()) {
            return 0;
        }

        int totalMarks = 0;

        for (Course course : courses) {
            totalMarks += course.getMarks();
        }

        return (double) totalMarks / courses.size();
    }

    public String calculateGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } 
        else if (percentage >= 80) {
            return "A";
        } 
        else if (percentage >= 70) {
            return "B";
        } 
        else if (percentage >= 60) {
            return "C";
        } 
        else if (percentage >= 50) {
            return "D";
        } 
        else {
            return "F";
        }
    }

    public void displayResult() {

        if (courses.isEmpty()) {
            System.out.println("No course records available.");
            return;
        }

        System.out.println("\n----- Academic Result -----");

        for (Course course : courses) {
            course.displayCourse();
        }

        System.out.println(
            "Percentage : " + calculatePercentage() + "%"
        );

        System.out.println(
            "Grade      : " + calculateGrade()
        );
    }
}