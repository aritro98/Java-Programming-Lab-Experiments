//2. Write a class ‘box’ in Java with three data members and a method called volume. Also write three constructors - one with zero parameter, one with one parameter and one with three parameters to initialize the data members.
//Implement this box class in another classwhere it’s object are created with different number of user entered dimensions and the corresponding volumes are displayed.
public class box {
	private float length;
	private float width;
	private float height;
	public box(){
		length=1;
		width=1;
		height=1;
	}
	public box(float a){
		length=a;
		width=a;
		height=a;
	}
	public box(float length,float width,float height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public float volume()
	{
		return length*width*height;
	}
}

