package lambda;

public class Add {
interface Addable
{
	int add(int a,int b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addable a1=(a,b)->(a+b);
System.out.println(a1.add(25, 35));
	Addable a2=(int a,int b)->{
		return (a+b);
	};
	System.out.println(a2.add(45, 70));
	}
	}

