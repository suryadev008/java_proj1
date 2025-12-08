import java.util.Scanner;
public class AreaOfRhombus{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base:");
        float base=sc.nextFloat();
        System.out.println("Enter Height:");
        float hight=sc.nextFloat();
        float area=(float)((base*hight)/2);
        System.out.println("Area of Parallelogram is:"+area);       
    }
}