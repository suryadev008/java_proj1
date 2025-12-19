// Sum Of A Digits Of Number
import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num= sc.nextInt();
        int tempNum=num;
        int rev=0;
        while(tempNum>0){
            int rem=tempNum%10;
            rev=rev*10+rem;
            tempNum=tempNum/10;
        }
        if(rev==num){
            System.out.println("Yes Palindrome Number"+num+"=="+rev);
        }else{
            System.out.println("No Palindrome Number"+num+"=="+rev);
        }          
        
    }
}