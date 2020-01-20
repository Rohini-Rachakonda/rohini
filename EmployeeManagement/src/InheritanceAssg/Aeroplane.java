package InheritanceAssg;

public class Aeroplane extends Automobile implements Fly {
String AeroplaneName;
void setAeroplaneName(String AeroplaneName)
{
	this.AeroplaneName=AeroplaneName;
}
	String show()
	{
		return "aeroplane";
	}
	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
interface Fly{
	int Maxspeed=100;
	int fly(int a);
	
}