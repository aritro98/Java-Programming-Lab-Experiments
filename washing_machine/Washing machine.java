interface Motor{
	void run();
	void consume();
	int capacity=90;
}

class Washing_machine implements Motor{
	public void run(){
		System.out.println("The washing machine runs effectively");
	}
	public void consume(){
		System.out.println("It consumes 1480 kJ/K of power");
	}
}
