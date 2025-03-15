//2.Write a program in java which will illustrate the working of two child threads and one main thread, all displaying in parallel a set of characters one at a time.
public class mcthread{
    public static void main(String[] args){
        Thread t1=new Thread(new letter('A'));
        Thread t2=new Thread(new letter('B'));
        t1.start();
        t2.start();
        for (int i=0;i<10;i++){
            System.out.println('C');
        }
    }
}

class letter implements Runnable{
    private char ch;
    public letter(char c){
        ch=c;
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(ch);
        }
    }
}
