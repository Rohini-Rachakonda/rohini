package cog;

abstract class AbstractClass
{
	//abstract method
	abstract void  add(int a,int b);
	//non abst method
	void show()
	{
		System.out.println("this is abstract class");
	}
}

class AbstractImpl extends AbstractClass
{
	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	this.show();
	}
}




public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl a1=new AbstractImpl();
		a1.add(2,4);
		}

}
