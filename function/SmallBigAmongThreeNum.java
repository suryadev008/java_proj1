import java.util.Scanner;
public class SmallBigAmongThreeNum{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First :");
		int num1=sc.nextInt();
		System.out.println("Enter Second :");
		int num2=sc.nextInt();
		System.out.println("Enter Third :");
		int num3=sc.nextInt();
		System.out.println("Select option:");
		System.out.println("1.Find Largest Among 3 number:");
		System.out.println("2.Find Smallest Among 3 number:");
		System.out.print("Enter Your Choice:");
		int ch=sc.nextInt();

		if(ch==1){
			int max=maxNum(num1,num2,num3);
			System.out.println("Largest:"+max);
		}else if (ch==2){
			int min=minNum(num1,num2,num3);
			System.out.println("smallest:"+min);
		}else{
			System.out.println("Wrong Entry");
		}
	}

	public static int minNum(int num1,int num2,int num3){
			int min=0;
			if(num1<num2 && num1<num3){
				min=num1;
			}else if(num2<num1 && num2<num3){
				min=num2;
			}
			else{
				min=num3;
			}	
			return min;
	}

	// find max number 
	public static int maxNum(int num1,int num2,int num3){
			int max=0;
			if(num1>num2 && num1>num3){
				max=num1;
			}else if(num2>num1 && num2>num3){
				max=num2;
			}
			else{
				max=num3;
			}
			return max;
	}
}