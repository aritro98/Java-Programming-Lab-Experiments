//4.Write a program in Java to create three child threads where the first thread will display“Good morning”, the second thread will
//display “Good afternoon” and the third thread will display “Good night” but the first thread will display after 2 seconds of second and third.
public class messagethread{
    public static void main(String[] args){
        Thread thread1 = new Thread(new DisplayMessage("Good morning"));
        Thread thread2 = new Thread(new DisplayMessage("Good afternoon"));
        Thread thread3 = new Thread(new DisplayMessage("Good night"));
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
class DisplayMessage implements Runnable {
    private String message;
    public DisplayMessage(String message) {
        this.message = message;
    }
    public void run() {
        System.out.println(message);
    }
}
