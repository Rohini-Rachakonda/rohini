package HashMap;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1, "hdfuf");
		map.put(2, "asdf");
		map.put(3, "fugujhu");
		Set set=map.entrySet();//converting to set type
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
			map.remove(2);
			System.out.println(map);
	}

}
