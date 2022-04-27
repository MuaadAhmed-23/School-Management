import java.util.ArrayList;
public class SchoolManagementSystem {
	public static void main(String[] args) {
		TeacherObject frank = new TeacherObject("Ahmed", 34, 3000, 3);
		TeacherObject william = new TeacherObject("Ahmed", 34, 3000, 6);
		TeacherObject stacy = new TeacherObject("Ahmed", 34, 3000, 9);
		TeacherObject robbie = new TeacherObject("Ahmed", 34, 3000, 12);
		
		StudentObject sarah = new StudentObject("Ahmed", 34, 3, 30000);
		StudentObject chuwi = new StudentObject("Ahmed", 4, 5, 30000);
		StudentObject anne = new StudentObject("Ahmed", 314, 6, 30000);
		StudentObject bob = new StudentObject("Ahmed", 67, 1, 30000);
		
		ArrayList<TeacherObject> teachers = new ArrayList<TeacherObject>();
		teachers.add(frank);
		teachers.add(william);
		teachers.add(stacy);
		teachers.add(robbie);
		
		
		frank.salaryCalculation();
		william.salaryCalculation();
		stacy.salaryCalculation();
		
		sarah.fees();
		chuwi.fees();
		anne.fees();
		bob.fees();
		
		ArrayList<StudentObject> students = new ArrayList<StudentObject>();
		students.add(sarah);
		students.add(chuwi);
		students.add(anne);
		students.add(bob);
		
		SchoolObject AUG = new SchoolObject(teachers, students, SchoolObject.revenue, SchoolObject.expenses);
		System.out.println("Total Money Earned: " + AUG.getRevenue());
		System.out.println("Total Money Spent on Salary: " + AUG.getExpenses());
	}
}