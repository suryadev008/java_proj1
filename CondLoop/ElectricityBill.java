import java.util.Scanner;
public class ElectricityBill{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        float units=sc.nextFloat();
        float bill=0;
        if(units<=100){
            bill=units*5;
        }else if(units>100 && units<=300){
            bill=100*5+(units-100)*7;
        }else{
            bill=100*5+200*7+(units-300)*10;
        }
        System.out.println("Electricity Bill is: "+bill);
    }
}
