public class Employee {
    private static String companyName = "Ayu's Tech";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ayushi", "Software Engineer");
        Employee emp2 = new Employee(102, "Pranjal", "HR Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        displayTotalEmployees();
    }
}
