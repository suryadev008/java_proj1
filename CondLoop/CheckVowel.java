// Sum Of A Digits Of Number
import java.util.Scanner;
public class CheckVowel{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Char:");
        char ch=sc.next().trim().charAt(0);
        System.out.println("ch="+ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}