import java.util.Scanner;
public class SwitchCaseFruit{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Fruit:");
		String name=sc.next().toLowerCase();
		switch(name){
		case "orange" -> System.out.println("Orange is Good");
		case "mango" -> System.out.println("King of Fruits");
		case "apple" -> System.out.println("Apple keeps doctor away");
		default -> System.out.print("Wrong Fruit");
		}
	}
}