//1.Write a Java class containing a data member and a method called ProcessInput(). This method checks the number 
//entered by the user. If the entered number is negative then throw an user defined exception called 
//NegativeNumberException, otherwise it displays the sum of the digits of the entered number.
public class negnum{
    int num;
    void ProcessInput(int num){
        this.num=num;
        try {
            if (num<0){
                throw new NegativeNumberException("Negative number entered:"+num);
            }
            else{
				int sum=0;
                while (num!=0){
                    sum=sum+num%10;
                    num=num/10;
                }
                System.out.println("The sum of the digits is:"+sum);
            }
        }
        catch (NegativeNumberException e){
			  System.out.println("Negative number entered");
        }
    }
    public static void main(String[] args){
        negnum n= new negnum();
        n.ProcessInput(123);
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
