import java.util.Scanner;
public class DistanceTwoPoints{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int x1=sc.nextInt();
        System.out.print("Enter a number:");
        int x2=sc.nextInt();
        System.out.print("Enter a number:");
        int y1=sc.nextInt();
        System.out.print("Enter a number:");
        int y2=sc.nextInt();
        float area=(float)(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println("area: "+area);
    }
}