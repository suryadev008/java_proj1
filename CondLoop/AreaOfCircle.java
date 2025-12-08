import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String args[]){
        float pia=3.14f;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        float r=sc.nextFloat();
        float area=pia*r*r;
        System.out.println("Area of Circle is:"+area);       
    }
}