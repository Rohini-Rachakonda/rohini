package cog;

class InvalidAgeException extends Exception{
	 InvalidAgeException(String s){
		super(s);
	}
}
public class CustomException {
	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("can vote");
	}
	public static void main(String args[]){
		try{
			validate(18);
		}
		catch(Exception r)
		{
			System.out.println("Exception occured:"+r);
		}
		System.out.println("remaining code");
	}

}
