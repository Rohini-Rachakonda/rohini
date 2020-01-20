package InheritanceAssg;

public class AutoMobileMain {
public static void main(String args[])
{
	Aeroplane a=new Aeroplane();
	a.setAeroplaneName("Airjet");
	System.out.println(a.AeroplaneName+"\nAutomobile is "+a.show()+"\nSpeed of aeroplane is "+a.Maxspeed);
	Train t=new Train();
	t.setTrainName("Express");
	System.out.println(t.TrainName+"\n Automobile is"+t.show());
	Ship s=new Ship();
	s.setshipName("titanic");
	System.out.println(s.shipName+"\n Automobile is:"+s.show());
}
}
