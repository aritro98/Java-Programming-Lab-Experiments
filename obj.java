//4. Write a program in Java to find no. of objects created out of a class using ‘static’ modifier
public class obj{
	public static int count;
	public obj()
	{
		count++;
	}
	public static void main(String args[]){
		obj ob1=new obj();
		obj ob2=new obj();
		System.out.println("No.of objects created are:"+obj.count);
	}
}
