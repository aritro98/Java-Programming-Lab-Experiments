//3. Write a Java program to calculate and print division of two user entered numbers. If the divisor value is zero 
//then handle the generated exception using catch block and in the finally block provide the user another chance to 
//enter the numbers.
import java.util.Scanner;
class dividerror{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Enter the 1st number:");
			int a=sc.nextInt();
			System.out.print("Enter the 2nd number:");
			int b=sc.nextInt();
			if (b==0){
				System.out.println("Division by zero has occurred");
			}
			else{
				int res=a/b;
				System.out.println("Result is:"+res);
			}
		}
		catch (ArithmeticException e){
			System.out.println("Division by zero has occurred");
		}
		finally{
			System.out.println("You have another chance to perform the operation");
			System.out.print("Enter the 1st number:");
			int a=sc.nextInt();
			System.out.print("Enter the 2nd number:");
			int b=sc.nextInt();
			if (b==0){
				System.out.println("Division by zero has occurred");
			}
			else{
				int res=a/b;
				System.out.println("Result is:"+res);
			}
		}
	}
}

