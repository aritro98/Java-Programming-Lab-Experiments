public class uptri{
    public static void main(String args[]){
        int rows,cols;
        int a[][]={{1, 2, 3},{8, 6, 4},{4, 5, 6}};
        rows=a.lengh;
        cols=a[0].length;
        for(int i=0;i<rows;i++)
        {
			for(int j=0;j<cols;j++)
			{
				if(i>j)
				{
					System.out.print("0 ");
				}
                else
                {
					System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
