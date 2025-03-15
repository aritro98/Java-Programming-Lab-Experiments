//1. Write a program to perform following operations on user entered string(s) –
//i) Reverse the string
//ii) Change the case of the string
//iii) Compare two strings
//iv) Insert one string into another string
import java.util.Scanner;
public class stringop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s1=sc.next();
		System.out.print("Enter another string:");
		String s2=sc.next();
		String s3=new String();
		System.out.print("Enter the index at which the second string is to be inserted:");
		int ix=sc.nextInt();
		String rs="";
		char ch;
		for (int i=0; i<s1.length();i++){
			ch=s1.charAt(i);
			rs=ch+rs;
		}
		System.out.println("Reversed string:"+rs);
		String us=s1.toUpperCase();
		String ls=s1.toLowerCase();
		System.out.println("Upper Cased string:"+us);
		System.out.println("Lower Cased string:"+ls);
		if (s1.equals(s2)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
		for (int i=0;i<s1.length();i++){
			s3+=s1.charAt(i);
			if (i==ix){
				s3+=s2;
			}
		}
        System.out.println("New String:"+s3);
	}
}
