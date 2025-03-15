import java.util.Scanner;
public class mybox{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		box b1=new box();
		b1.volume();
		System.out.println("Enter the side of the box:");
		float s=sc.nextFloat();
		box b2=new box(s);
		b2.volume();
		System.out.println("Enter the length of the box:");
		float length=sc.nextFloat();
		System.out.println("Enter the width of the box:");
		float width=sc.nextFloat();
		System.out.println("Enter the height of the box:");
		float height=sc.nextFloat();
		box b3=new box(length,width,height);
		b3.volume();
	}
}
