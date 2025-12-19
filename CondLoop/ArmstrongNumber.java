// Sum Of A Digits Of Number
import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num= sc.nextInt();
        int tempNum=num;
        int arm=0;
        while(tempNum>0){
            int rem=tempNum%10;
            arm+=(int)(Math.pow(rem,3));
            tempNum=tempNum/10;
        }
        if(arm==num){
            System.out.println("Yes Palindrome Number"+num+"=="+arm);
        }else{
            System.out.println("No Palindrome Number"+num+"=="+arm);
        }          
        
    }
}