package InheritanceAssg;
interface Runnable
{
	int speed=90;
	int run(int b);
}
public class Train extends Automobile implements Runnable {
	String TrainName;
	public String show()
	{
		return "train";
	}
	void setTrainName(String TrainName)
	{
		this.TrainName=TrainName;
	}


	@Override
	public int run(int b) {
		// TODO Auto-generated method stub
		return b;
	}

}
