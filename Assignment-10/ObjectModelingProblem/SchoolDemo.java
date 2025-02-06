import java.util.*;

class Course {
	private String name;
	private List<Student> enrolledStudents;

	public Course(String name) {
		this.name = name;
		this.enrolledStudents = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void enrollStudent(Student student) {
		enrolledStudents.add(student);
	}

	public void showEnrolledStudents() {
		System.out.println("Course: " + name);
		for (Student student : enrolledStudents) {
			System.out.println(" - " + student.getName());
		}
	}
}

class Student {
	private String name;
	private List<Course> courses;

	public Student(String name) {
		this.name = name;
		this.courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void enrollInCourse(Course course) {
		courses.add(course);
		course.enrollStudent(this);
	}

	public void showEnrolledCourses() {
		System.out.println("Student: " + name + " is enrolled in:");
		for (Course course : courses) {
			System.out.println(" - " + course.getName());
		}
	}
}

class School {
	private String name;
	private List<Student> students;

	public School(String name) {
		this.name = name;
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void showStudents() {
		System.out.println("School: " + name + " has students:");
		for (Student student : students) {
			System.out.println(" - " + student.getName());
		}
	}
}

public class SchoolDemo {
	public static void main(String[] args) {
		School school = new School("GLA University");

		Student s1 = new Student("Ayushi");
		Student s2 = new Student("Pranjal");

		Course c1 = new Course("Java Programming");
		Course c2 = new Course("Cloud Computing");

		school.addStudent(s1);
		school.addStudent(s2);

		s1.enrollInCourse(c1);
		s1.enrollInCourse(c2);
		s2.enrollInCourse(c2);

		school.showStudents();
		s1.showEnrolledCourses();
		s2.showEnrolledCourses();
		c1.showEnrolledStudents();
		c2.showEnrolledStudents();
	}
}
