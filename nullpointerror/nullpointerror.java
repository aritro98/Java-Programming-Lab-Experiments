class nullpointerror{
	public static void main(String[] args){
		try{
			String name=null;
			int l=name.length();
			System.out.println(l);
		}
		catch(NullPointerException e){
			System.out.println("String name is not initialised");
		}
	}
}
