// Sum Of A Digits Of Number
import java.util.Scanner;
public class DepreciationCalcu{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Initial Cost:");
        int initCost= sc.nextInt();
         System.out.println("Enter a Salvage Value:");
        int salvage= sc.nextInt();
         System.out.println("Enter a Useful Life:");
        int useful= sc.nextInt();
        int depreciation=(initCost-salvage)/useful;
        System.out.println("depreciation:"+depreciation);
    }
}