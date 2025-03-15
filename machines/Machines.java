public class Machines{
	public static void main(String[] args){
		Washing_machine m=new Washing_machine();
		System.out.println("Capacity:"+m.capacity);
		m.run();
		m.consume();
	}
}
