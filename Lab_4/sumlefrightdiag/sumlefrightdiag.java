import java.util.Scanner;
 public class sumlefrightdiag{
	 public static void main(String args[]){
		 int sleft=0,sright=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of rows");
		 int r=sc.nextInt();
		 System.out.println("Enter the number of columns");
		 int c=sc.nextInt();
		 int arr[][]=new int[r][c];
		 System.out.println("Enter the elements of the matrix");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println("");
		 }
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 if(i+j==r-1 && i==j)
				 {
					 sleft=sleft+arr[i][j];
					 sright=sright+arr[i][j];
				 }
			 }
		 }
		 System.out.println("Sum of Left Diagonal Elements:"+sleft);
		 System.out.println("Sum of Right Diagonal Elements:"+sright);
	 }
 }
