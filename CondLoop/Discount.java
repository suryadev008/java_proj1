import java.util.Scanner;
public class Discount{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Price:");
        float price=sc.nextFloat();
        // int fact=1;
        float discount=0;
        float discAmt=0;
        if(price>500 && price<=2000){
            discAmt=(float)(price*0.10);
        }else if(price>2000 && price<=5000){
             discAmt=(float)(price*0.20);
        }
        else if(price>5000){
            discAmt=(float)(price*0.30);
        }
        System.out.println("Total Amt:"+price);
        System.out.println("Total Discount:"+discAmt);
        System.out.println("Net Amount:"+(float)(price-discAmt));
    }
}