package CollectionComparable;
import java.util.*;

public class NameComparator implements Comparator{
	public int compare(Object o1,Object o2){
		EmployeeComparator e1=(EmployeeComparator) o1; //typeconversion from obj to empcom 
		EmployeeComparator e2=(EmployeeComparator) o2;
		return e1.empName.compareTo(e2.empName);
	}
	

}
