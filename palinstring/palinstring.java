//2. Write a program to check whether the entered string is palindrome or not.
import java.util.Scanner;
public class palinstring{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s1=sc.next();
		String s2="";
		char ch;
		for (int i=0; i<s1.length();i++){
			ch=s1.charAt(i);
		    s2=ch+s2;
		}
		if (s1.equals(s2)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}
