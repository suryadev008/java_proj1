// Sum Of A Digits Of Number
import java.util.Scanner;
public class DigitSum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int tempnum=num;
        int sum=0;
        while(tempnum>0){
            int rem = tempnum%10;
            sum+=rem;
            tempnum/=10;
        }
        System.out.println("Sum of "+num+" is "+sum);        
    }
}
