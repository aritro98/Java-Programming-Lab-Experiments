class box0 {
	float length;
	float width;
	float height;
	void volume()
	{
		System.out.println("Volume is : "+length*width*height);
	}
	void dim()
	{
		System.out.println("Dimensions are :"+length +" "+width+" "+height);
	}
	void setdim(float l, float w, float h)
	{
	length= l;
	width=w;
	height=h;
	}
}
