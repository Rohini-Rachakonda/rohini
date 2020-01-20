package cog;

public class VarArgsEx {
	static void add(int... values){
		int s=0;
		System.out.println("add method invoked");
		for(int i:values){
			s=s+i;
			
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,3);
		add(2,3,5);

	}

}
