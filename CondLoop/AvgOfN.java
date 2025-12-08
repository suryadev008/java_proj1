import java.util.Scanner;
public class AvgOfN{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        float avg;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        avg=(float)sum/n;
        System.out.println("Average of first "+n+" natural numbers is: "+avg);
    }
}