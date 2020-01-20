package CollectionComparable;

import java.util.*;
import java.util.Collections;

public class MainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(new EmployeeComparator(1001,"abc",22));
		a1.add(new EmployeeComparator(1002,"def",21));
		a1.add(new EmployeeComparator(1000,"aagh",20));
		System.out.println("sort it by name");
		Collections.sort(a1,new NameComparator());
		Iterator itr=a1.iterator();
			while(itr.hasNext())
			{
				EmployeeComparator emp=(EmployeeComparator) itr.next();
				System.out.println(emp.empId+" "+emp.empName+" "+emp.empAge);
			}
		System.out.println("sort by age");
		Collections.sort(a1,new AgeComparator());
		Iterator itr1=a1.iterator();
			while(itr1.hasNext())
			{
				EmployeeComparator emp=(EmployeeComparator) itr1.next();
				System.out.println(emp.empId+" "+emp.empName+" "+emp.empAge);
			}
		
	}

}
