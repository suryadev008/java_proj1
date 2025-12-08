import java.util.Scanner;
public class AreaOfIsosceles{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base:");
        float base=sc.nextFloat();
        System.out.println("Enter Height:");
        float hight=sc.nextFloat();
        float area=(float)((base/4f)*(Math.sqrt(4*hight*hight+base*base)));
        System.out.println("Area of Isosceles is:"+area);       
    }
}