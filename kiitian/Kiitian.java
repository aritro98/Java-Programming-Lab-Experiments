import java.util.Scanner;
public class Kiitian extends Student{
	super(Rollno,Course);
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Roll No:");
	int Rollno=sc.nextInt();
	System.out.print("Enter the course:");
	String Course=sc.nextLine();
	void hostel_request(){
		System.out.println(Rollno+"has requested for Hostel Accomodation");
	}
}

public static void main(String args[]){
	Kiitian ob1=new