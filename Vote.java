//1. A citizen has the attributes as voterid, name, age and performs two operations- Register and Cast. Register operation will take all details from user. If the entered age is less than 18 then throw NotEligibleException and display a message to try next year. Otherwise display a message of “Successfully registered” and calls the cast method for casting his/her vote.
import java.util.Scanner;
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
class Citizen {
    String voterId;
    String name;
    int age;
    public void Register() throws NotEligibleException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Voter ID:");
        this.voterId = sc.nextLine();
        System.out.print("Enter Name:");
        this.name = sc.nextLine();
        System.out.print("Enter Age:");
        this.age = sc.nextInt();
        if (this.age < 18) {
            throw new NotEligibleException("Try next year");
        }
        else {
            System.out.println("Successfully registered");
            Cast();
        }
    }
    public void Cast() {
        System.out.println("Casting vote");
    }
}
public class Vote {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        try {
            citizen.Register();
        }
        catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
