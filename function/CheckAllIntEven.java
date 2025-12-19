import java.util.Scanner;
public class CheckAllIntEven{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		boolean isTrue=CheckNumber(num);
		System.out.println("isTrue:"+isTrue);

	}

	public static boolean CheckNumber(int num){
		while(num>0){
			int rem=num%10;
			num/=10;
			if(rem%2!=0){
				return false;
			}		
		}
		return true;
	}
}