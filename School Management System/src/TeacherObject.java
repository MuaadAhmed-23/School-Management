public class TeacherObject extends SchoolManagementSystem{
	private String name;
	private int id;
	private int basesalary = 30000;
	private int years;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public TeacherObject(String name, int id, int basesalary, int years) {
		this.name = name;
		this.id = id;
		this.basesalary = basesalary;
		this.years = years;
	}
	
	public int getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(int basesalary) {
		this.basesalary = basesalary;
	}

	public int salaryCalculation() {
		int salaryCalc = (getYears() * 2000) + getBasesalary(); 
		SchoolObject.revenue -= salaryCalc;
		SchoolObject.expenses += salaryCalc;
		return salaryCalc;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years; 
	}
}