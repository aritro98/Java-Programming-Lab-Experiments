import java.util.Scanner;
public class objbox{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the box:");
        float length=sc.nextFloat();
        System.out.print("Enter the width of the box:");
		float width=sc.nextFloat();
		System.out.print("Enter the height of the box: ");
        float height=sc.nextFloat();
        box b=new box();
        float volume=b.volume();
        System.out.println("The volume of the box is:"+volume);
	}
}
