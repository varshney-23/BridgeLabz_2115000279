public class Student {
    private static String universityName = "Varshney University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Ayushi", "A");
        Student student2 = new Student(102, "Pranjal", "A+");

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        displayTotalStudents();
    }
}
