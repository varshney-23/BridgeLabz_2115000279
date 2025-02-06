import java.util.*;
class Company {
	private String name;
	private List<Department> departments;

	public Company(String name) {
		this.name = name;
		this.departments = new ArrayList<>();
	}

	public void addDepartment(String departmentName) {
		departments.add(new Department(departmentName));
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void displayDepartments() {
		System.out.println("Company: " + name);
		for (Department department : departments) {
			department.displayEmployees();
		}
	}
}

class Department {
	private String name;
	private List<Employee> employees;

	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}

	public void addEmployee(String employeeName) {
		employees.add(new Employee(employeeName));
	}

	public void displayEmployees() {
		System.out.println("Department: " + name);
		for (Employee employee : employees) {
			System.out.println("Employee: " + employee.getName());
		}
	}
}

class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class CompanyDemo {
	public static void main(String[] args) {
		Company company = new Company("Varshney Sols");
		company.addDepartment("DIY CRAFTS");
		company.addDepartment("Card");

		List<Department> departmentList = company.getDepartments();
		Department engineering = departmentList.get(0);
		Department hr = departmentList.get(1);

		engineering.addEmployee("Ayu");
		engineering.addEmployee("Pran");
		hr.addEmployee("Panda");

		company.displayDepartments();
	}
}