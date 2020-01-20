package cog;

class AutomobileCar {
	int  run()
	{
		return 60;
	}
}
class FordCar extends AutomobileCar
{
	int run()
	{
		return super.run()+40;
	}
}

public class Car{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordCar f=new FordCar();
		System.out.println(f.run());
	}

}
