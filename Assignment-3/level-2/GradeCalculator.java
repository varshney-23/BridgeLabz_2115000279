import java.util.Scanner;

public class GradeCalculatorAyushi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        double totalMarks = physics + chemistry + maths;
        double averageMarks = totalMarks / 3;
        double percentage = (totalMarks / 300) * 100;

        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Average Marks: %.2f\n", averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
