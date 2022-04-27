public class StudentObject extends SchoolManagementSystem{
	private String name;
	private int id;
	private int grade;
	public int feespaid;
	
	public String getName() {
		return name;
	}

	public int getFeespaid() {
		return feespaid;
	}


	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	
	public StudentObject(String name, int id, int grade, int feespaid) {
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.feespaid = feespaid;
	}
	
	public int fees() {
		SchoolObject.revenue += feespaid;
		return feespaid;
	}
}