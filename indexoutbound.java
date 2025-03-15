//1. Write a Java program to generate an ArrayIndexOutofBoundsException andhandleitusing catch statement.
import java.util.Scanner;
class indexoutbound{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			int[] arr=new int[5];
			System.out.println("Enter the numbers:");
			for (int i=0;i<5;i++)
			{
				int a=sc.nextInt();
			}
	        System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index is out of range");
		}
	}
}
