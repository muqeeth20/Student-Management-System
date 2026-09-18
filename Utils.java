public class Utils {

    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age) {

        return age >= 16 && age <= 100;
    }

    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");
    }

    public static boolean isValidMarks(int marks) {

        return marks >= 0 && marks <= 100;
    }
}