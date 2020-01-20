package cog;

import java.util.*;
import java.util.Collections;

public class CollectionuserDefinedSorting1 implements Comparable<CollectionuserDefinedSorting1> {
	String empName;
	int empId;
	int empSalary;
	String empLocation;
	/*@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary
				+ ", empLocation=" + empLocation + "]";
	}*/
	public CollectionuserDefinedSorting1(String empName, int empId, int empSalary,String empLocation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empLocation=empLocation;
	}
	public int compareTo(CollectionuserDefinedSorting1 emp){
		
			return	this.empId-emp.empId;
		}

	/*public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String  getempLocation() {
		return empLocation;
	}
	public void setempLocation(int empId) {
		this.empLocation = empLocation;
	}
	
	int grossSalary()
	{
		return 12*empSalary;
	}*/
	/*public static void main(String[] args){
		EmployeeDetails e=new EmployeeDetails("rohini",123,50000,"Chennai");
		
		System.out.println("name:"+e.empName+" id:"+e.empId+" salary"+e.empSalary+"location"+e.empLocation);
		System.out.println(e.grossSalary());
	}*/


	public static void main(String[] args){
		ArrayList<CollectionuserDefinedSorting1> e=new ArrayList<CollectionuserDefinedSorting1>();
		e.add(new CollectionuserDefinedSorting1("rohini",5,50000,"chennai"));
		e.add(new CollectionuserDefinedSorting1("anu",2,50000,"abc"));
		Collections.sort(e);
		for(CollectionuserDefinedSorting1 d :e)
		{
			System.out.println(d.empName+" "+d.empId+" "+d.empSalary+" "+d.empLocation);
		}
	
	}
}
