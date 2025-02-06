import java.util.*;

class Faculty {
	private String name;

	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Department {
	private String departmentName;

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}
}

class University {
	private String universityName;
	private List<Department> departments;
	private List<Faculty> faculties;   

	public University(String universityName) {
		this.universityName = universityName;
		this.departments = new ArrayList<>();
		this.faculties = new ArrayList<>();
	}

	public void addDepartment(String deptName) {
		departments.add(new Department(deptName));
	}
	public void addFaculty(Faculty faculty) {
		if (!faculties.contains(faculty)) {
			faculties.add(faculty);
		}
	}

	public void displayDepartments() {
		System.out.println("Departments in " + universityName + ":");
		for (Department dept : departments) {
			System.out.println("- " + dept.getDepartmentName());
		}
	}

	public void displayFaculties() {
		System.out.println("Faculty members in " + universityName + ":");
		for (Faculty faculty : faculties) {
			System.out.println("- " + faculty.getName());
		}
	}

	public void deleteUniversity() {
		System.out.println("Deleting University: " + universityName);
		departments.clear();  
		System.out.println("All departments removed.");
	}
}

public class UniversityManagement1 {
	public static void main(String[] args) {

		University university = new University("Varshney University");

		Faculty profAyu = new Faculty("Prof. Ayu");
		Faculty profPran = new Faculty("Prof. Pran");

		university.addFaculty(profAyu);
		university.addFaculty(profPran);

		university.addDepartment("Computer Science");
		university.addDepartment("Mechanical Engineering");

		university.displayFaculties();
		university.displayDepartments();

		university.deleteUniversity();

		System.out.println("Faculty members still exist after University deletion:");
		System.out.println("- " + profAyu.getName());
		System.out.println("- " + profPran.getName());
	}
}