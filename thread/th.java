//2. Write a program in Java using two threads where one will display a series of numbers within an user entered range with a gap of 5 milliseconds between each number and another thread will display each character of the student name in separate line.
import java.util.Scanner;
class NumTh extends Thread {
    int start, end;
    NumTh(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class NameTh extends Thread {
    String name;
    NameTh(String name) {
        this.name = name;
    }
    public void run() {
        for (char c : name.toCharArray()) {
            System.out.println(c);
        }
    }
}
public class th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range:");
        int end = sc.nextInt();
        System.out.print("Enter the student's name:");
        String name = sc.next();
        NumTh nth = new NumTh(start, end);
        NameTh nath = new NameTh(name);
        nth.start();
        nath.start();
    }
}
