public class Savings_Account{
    public static float intrate=5.0f;
    private int accountno;
    private String name;
    private float balance;
    public Savings_Account(int accountno,String name,float balance){
        this.accountno=accountno;
        this.name=name;
        this.balance=balance;
    }
    public static void modifyIntrate(float nrate) {
        intrate=nrate;
    }
    public float calculate_Interest(int period) {
        float interest=(balance*intrate*period)/100.0f;
        return interest;
    }
    public static void main(String args[]){
        Savings_Account account1=new Savings_Account(1001,"Alice",10000.0f);
        float interest1=account1.calculate_Interest(1);
        System.out.println("Interest for account 1:"+interest1);
        Savings_Account.modifyIntrate(7.0f);
        Savings_Account account2=new Savings_Account(1002, "Bob", 10000.0f);
        float interest2 = account2.calculate_Interest(1);
        System.out.println("Interest for account 2: "+interest2);
    }
}
