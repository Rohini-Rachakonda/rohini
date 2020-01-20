package cog;

class A1
{
	static final double pi=3.14;
	void display()
	{
		System.out.println("Class A");
	}
}
class B1 extends A1
{
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}
public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A1.pi);
	}

}
