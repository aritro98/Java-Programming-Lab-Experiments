abstract class student{
	int rollno;
	int regno;
	public student(int rollno,int regno){
		this.rollno=rollno;
		this.regno=regno;
	}
	abstract void course();
}

class kiitian extends student{
	kiitian(int rollno,int regno){
		super(rollno,regno);
	}
	void course(){
		System.out.println("Course taken in:");
	}
}


