package Assignments;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr,i;
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
			yr=sc.nextInt();
	if((yr%4)==0&&(yr%400)==0){
		System.out.println("this is leap year");
		}
	else
		System.out.println("this is not a leap year");
	}

}
