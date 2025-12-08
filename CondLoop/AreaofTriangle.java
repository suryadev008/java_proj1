import java.util.Scanner;
public class AreaofTriangle{
    public static void main(String args[]){
        float pia=3.14f;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base:");
        float base=sc.nextFloat();
        System.out.println("Enter Height:");
        float hight=sc.nextFloat();
        float area=0.5f*base*hight;
        System.out.println("Area of Triangle is:"+area);       
    }
}