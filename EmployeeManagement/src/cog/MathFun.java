package cog;
import java.util.Date;
import java.util.Scanner;

public class MathFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=14;
		System.out.println("Absolute "+Math.abs(a));
		System.out.println("Max num "+Math.max(a, b));
		System.out.println("min num "+Math.min(9, 5));
		System.out.println("power "+Math.pow(2, 3));
		System.out.println("hypot "+Math.hypot(a,b));
		System.out.println("a*(2^b)  "+Math.scalb(a,b));
		System.out.println("floor div"+Math.floorDiv(a,b));
		System.out.println("Random "+Math.random());
		Date date=new Date();
		System.out.println("Date is: "+date);
		


	}

}
