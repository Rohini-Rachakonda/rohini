package cog;
import java.util.*;
public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> e=new ArrayList<String>();
		e.add("a");
		e.add("b");
		e.add("c");
		System.out.println(e);
		ArrayList<String> e1=new ArrayList<String>();
		e1.add("d");
		e1.add("e");
		e1.add("f");
		e.addAll(e1);
		System.out.println(e);
		e.removeAll(e1);
		System.out.println(e);
		e.remove("a");
		e.addAll(e1);
		System.out.println(e);
		e.size();
		System.out.println(e.size());
		e1.remove("d");
		System.out.println(e1);
		System.out.println(e.retainAll(e1));
		System.out.println(e.removeAll(e1));
		System.out.println(e1);
		System.out.println(e.retainAll(e1));}

}
