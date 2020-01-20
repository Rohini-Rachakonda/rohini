package Assignments;

import java.util.Scanner;

public class Taxpay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String gender;
		double income;
		System.out.println("Enter your name,gender,income");
		
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		gender=sc.nextLine();
		income=sc.nextDouble();
		if(gender=="male"||gender=="others")
		{
			if(income>=0 && income<=180000)
				System.out.println("Mr. no tax to be paid");
			else if(income>=180001 && income<=500000)
				
				System.out.println("Mr.Tax to be paid is 10%"+income/10);
			else if(income>=500001 && income<=800000)
				System.out.println("Mr.Tax to be paid is20%"+income/20);
			else
				System.out.println("Mr.Tax to be paid is 30%"+income/30);
			
		}
		else
		{
		 if(income>=0 && income<=190000)
			System.out.println("no tax to be paid ");
		 else if(income>=190001 && income<=500000)
			 System.out.println("Tax to be paid is10%"+income/10);
		 else if(income>=500001 && income<=800000)
				System.out.println("Tax to be paid is 20%"+income/20);
		 else
				System.out.println("Tax to be paid is 30%"+income/30);
		}
	}

}
