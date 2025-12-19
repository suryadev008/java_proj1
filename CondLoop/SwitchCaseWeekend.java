import java.util.Scanner;
public class SwitchCaseWeekend{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your 1-7:");
		int num=sc.nextInt();
		switch(num){
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7 -> System.out.println("Weekend");
		default -> System.out.print("Please enter correct");
		}
	}
}