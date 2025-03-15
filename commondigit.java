import java.util.Scanner;
public class commondigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.print("Enter the second number:");
		int b=sc.nextInt();
		int[] dC1=new int[10];
        int[] dC2=new int[10];
		int t1=a;
		while (t1>0)
		{
            dC1[t1%10]++;
            t1/=10;
        }
        int t2=b;
		while (t2>0)
		{
            dC2[t2%10]++;
            t2/=10;
        }
        System.out.print("Common digits:");
		for (int i=0;i<10;i++)
		{
            if (dC1[i]>0 && dC2[i]>0)
            {
	            System.out.print(i+" ");
		    }
		}
		System.out.println();
	}
}

