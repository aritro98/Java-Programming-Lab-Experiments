import java.util.Scanner;
public class bitwiseop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int b=sc.nextInt();
		int and=a&b;
		int or=a|b;
		int xor=a^b;
		System.out.println("Result of AND Operation:"+and);
		System.out.println("Result of OR Operation:"+or);
		System.out.println("Result of XOR Operation:"+xor);
	}
}
