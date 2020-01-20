package InheritanceAssg;
interface swim
{
	int speed=80;
	int swim(int c);
}
public class Ship extends Automobile implements swim{	
	String shipName;
	void setshipName(String shipName)
	{
		this.shipName=shipName;
	}
	@Override
	public int swim(int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String show() {
		// TODO Auto-generated method stub
		return "ship";
	}

}
