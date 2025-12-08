import java.util.Scanner;
public class AreaOfParallelogram{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base:");
        float base=sc.nextFloat();
        System.out.println("Enter Height:");
        float hight=sc.nextFloat();
        float area=base*hight;
        System.out.println("Area of Parallelogram is:"+area);       
    }
}