package CollectionComparable;

import java.util.*;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		EmployeeComparator e1=(EmployeeComparator) o1;
		EmployeeComparator e2=(EmployeeComparator) o2;
		if(e1.empAge==e2.empAge)
			return 0;
		else if(e1.empAge>e2.empAge)
			return 1;
		else 
			return -1;

	}
	

}
