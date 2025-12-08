import java.util.Scanner;
public class Commission{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a sales:");
        float sales=sc.nextFloat();
        // int fact=1;
        float discount=0;
        float commAmt=0;
        if(sales>5000 && sales<=10000){
            commAmt=(float)(sales*0.05);
        }else if(sales>10000 && sales<=20000){
             commAmt=(float)(sales*0.10);
        }
        else if(sales>20000){
            commAmt=(float)(sales*0.15);
        }
        System.out.println("Sales Amt:"+sales);
        System.out.println("Total Commission:"+commAmt);
        System.out.println("Net Amount:"+(float)(sales+commAmt));
    }
}