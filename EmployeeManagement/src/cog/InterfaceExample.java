package cog;
class AirAutomobile implements Fly
{
	double speed=100;
	String modelNo;
	void setModelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
		String show()
		{
			return modelNo;
		}
		public int fly(int a)
		{
			return a;
		}
}
		interface Fly
		{
			int MaxSpeed=100;
			 int fly(int a);
		}

public abstract class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomobile a=new AirAutomobile();
		a.setModelNo("Airbus");
		System.out.println("Aeroplane name is:"+a.show());
		System.out.println("Aeroplane is flying with:"+a.fly(90));
		System.out.println("Max speed of aeroplane is:"+Fly.MaxSpeed);
	}

}
