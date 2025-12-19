import java.util.Scanner;
public class ConvMinToTime{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Minutes:");
		int min=sc.nextInt();
		if(min>0){
			float hours=(float)(min/60);
			System.out.println("Hours:"+hours);
			float days=(float)(hours/24);
			System.out.println("Days:"+days);
			float years=(float)(days/365);
			System.out.println("Years:"+years);
			
		}else{
			System.out.println("Wrong Entry");
		}
	}
}