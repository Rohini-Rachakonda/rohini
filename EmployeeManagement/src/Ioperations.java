import java.io.*;
public class Ioperations {

	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("E:\\IOStream.txt");
			String s="Welcome to Java Program";
			byte b[]=s.getBytes();
			fout.write(65);
			fout.close();
			System.out.println("Sucess");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
