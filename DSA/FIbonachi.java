import java.util.Scanner;
public class FIbonachi {
    public static void main(String ags[]){
        int n1=0;
        int n2=1;
        int n3;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n3=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=n3;i++){
            sum=n1+n2;
             System.out.print(sum+" ");
             n1=n2;
             n2=sum;
        }        
    }
}