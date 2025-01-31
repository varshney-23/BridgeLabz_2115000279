public class Employee {
	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void DisplayEmployee() {
		System.out.println("name -> " + this.name);
		System.out.println("id -> " + this.id);
		System.out.println("Salary -> " + this.salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Ayushi", 63, 55985.78);
		emp.DisplayEmployee();
	}
}
