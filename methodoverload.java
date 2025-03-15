//1. Illustrate method overloading of ‘multiplication’ method in Java with different no. of inputs and different types of input.
public class methodoverload{
	public int prod(int x,int y)
	{
		return x*y;
	}
	public int prod(int x,int y,int z)
	{
		return x*y*z;
	}
	public double prod(double x,double y)
	{
		return x*y;
	}
	public static void main(String args[]){
		methodoverload p=new methodoverload();
		System.out.println(p.prod(8,2));
		System.out.println(p.prod(8,4,8));
		System.out.println(p.prod(1.5,2.5));
	}
}

