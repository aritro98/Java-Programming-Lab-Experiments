//3. Write a program in java to illustrate the working of two child threads in synchronized mode.
class SR{
    synchronized void print(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Th1 extends Thread{
    SR t;
    Th1(SR t){
        this.t=t;
    }
    public void run(){
        t.print(5);
    }
}

class Th2 extends Thread{
    SR t;
    Th2(SR t){
        this.t=t;
    }
    public void run(){
        t.print(10);
    }
}

public class cthread{
    public static void main(String args[]){
        SR obj = new SR();
        Th1 t1 = new Th1(obj);
        Th2 t2 = new Th2(obj);
        t1.start();
        t2.start();
    }
}
