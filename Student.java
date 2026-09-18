public class Student {

    private int studentId;
    private String name;
    private int age;
    private String department;
    private String phone;

    public Student(int studentId, String name, int age,
                   String department, String phone) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayStudent() {

        System.out.println("\n----- Student Details -----");
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Department  : " + department);
        System.out.println("Phone       : " + phone);
    }
}