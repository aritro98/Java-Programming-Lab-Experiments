import java.util.Scanner;
public class stringpos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = "";
        if(args.length > 0) {
            s1 = args[0];
        }
        else {
            System.out.println("No command-line arguments provided. Please enter a string:");
            s1 = sc.nextLine();
        }
        System.out.println("Enter a second string:");
        String s2 = sc.nextLine();
        int pos = firstdiff(s1,s2);
        if (pos == -1){
            System.out.println("The strings are identical.");
        }
        else{
            System.out.println("The first difference is at position: " + (pos+1));
        }
    }
    private static int firstdiff(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int minl = Math.min(l1,l2);
        for (int i = 0; i < minl; i++){
            if (s1.charAt(i) != s2.charAt(i)) {
                return i;
            }
        }
        if (l1 != l2) {
            return minl;
        }
        return -1;
    }
}
