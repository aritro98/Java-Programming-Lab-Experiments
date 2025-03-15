//3. Write a program to check the number of words, vowels present in the user entered string.
import java.util.Scanner;
public class voword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int cword=countWords(s);
        int cvowel=countVowel(s);
        System.out.println("Number of words:"+cword);
        System.out.println("Number of vowels:"+cvowel);
    }
    private static int countWords(String str){
        String trim = str.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split(" ").length;
    }
    private static int countVowel(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        return count;
    }
}
