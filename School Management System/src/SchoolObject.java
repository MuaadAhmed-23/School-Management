import java.util.ArrayList;
public class SchoolObject extends SchoolManagementSystem {
	
	private ArrayList<TeacherObject> teachers;
	private ArrayList<StudentObject> students;
	private TeacherObject teacher;
	private StudentObject student;
	public static int revenue;
	public static int expenses;
	
	public TeacherObject getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherObject teacher) {
		this.teacher = teacher;
	}

	public StudentObject getStudent() {
		return student;
	}

	public void setStudent(StudentObject student) {
		this.student = student;
	}
	
	public SchoolObject(ArrayList<TeacherObject> teachers, ArrayList<StudentObject> students, int revenue, int expenses) {
		this.students = students;
		this.teachers = teachers;
		this.revenue = revenue;
		this.expenses = expenses;
	}
	
	public ArrayList<TeacherObject> getTeachers() {
		return teachers;
	}

	public ArrayList<StudentObject> getStudents() {
		return students;
	}

	public void setTeachers(ArrayList<TeacherObject> teachers) {
		this.teachers = teachers;
	}

	public void setStudents(ArrayList<StudentObject> students) {
		this.students = students;
	}
	
	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
}