//1. Write a program to accept 5 numbers from user and print the repeated numbers, if any
import java.util.Scanner;
public class dupnum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    int[] arr=new int[5];
		System.out.println("Enter 5 numbers:");
		for (int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The repeated numbers are:");
		for (int i=0;i<5;i++)
		{
			for (int j=i+1;j<5;j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}

