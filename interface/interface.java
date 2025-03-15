import java.util.Scanner;
interface num{
	public int check(n){
		Scanner sc=new Scanner(System.in);
		if (n>0){
			System.out.println("Positive");
		}
		else if (n<0){
			system.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}

class number implements num{
	public static void main(String[] args){
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.print("The number you entered is:");
		check(n);
	}
}

