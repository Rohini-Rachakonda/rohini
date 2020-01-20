package cog;
class Engine{
	int enginenum,age;
	String fuelType;
	public Engine(int enginenum, int age, String fuelType) {
		super();
		this.enginenum = enginenum;
		this.age = age;
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Engine [enginenum=" + enginenum + ", age=" + age + ", fuelType=" + fuelType + "]";
	}
	public int getEnginenum() {
		return enginenum;
	}
	public void setEnginenum(int enginenum) {
		this.enginenum = enginenum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
 class Cars
{
	Engine e;
	int carnum;
	String carname;
	public Cars(Engine e, int carnum, String carname) {
		super();
		this.e = e;
		this.carnum = carnum;
		this.carname = carname;
	}
	/*public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}*/
	public int getCarnum() {
		return carnum;
	}
	public void setCarnum(int carnum) {
		this.carnum = carnum;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	@Override
	public String toString() {
		return "Car [e=" + e + ", carnum=" + carnum + ", carname=" + carname + "]";
	}
	
}
public class HasEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(e1.Engine());
		Cars c=new Cars(new Engine(11,22,"asdf"),4566,"audi");
		System.out.println(c);
	}

}
