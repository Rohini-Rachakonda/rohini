package cog;

public class WageEmployees extends CollectionuserDefinedSorting1 {
	int numbers;
	@Override
	public String toString() {
		return "WageEmployees [numbers=" + numbers + ", hours=" + hours + ", empName=" + empName + ", empId=" + empId
				+ ", empSalary=" + empSalary + ", empLocation=" + empLocation + "]";
	}
	int hours;
	public WageEmployees(String empName, int empId, int empSalary, String empLocation, int numbers, int hours) {
		super(empName, empId, empSalary, empLocation);
		this.numbers = numbers;
		this.hours = hours;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	int calemp(){
		return numbers*hours*empSalary;
	}
}
