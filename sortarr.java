//2. Write a program to sort a user entered list of numbers using array
import java.util.Scanner;
public class sortarr{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int temp=0;
        System.out.println("Enter the numbers:");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
               if(arr[i]>arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        System.out.println("Elements of the sorted array:");
        for (int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
