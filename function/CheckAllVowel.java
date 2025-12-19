import java.util.Scanner;
public class CheckAllVowel{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		boolean isTrue=CheckVowel(str);
		System.out.println("isTrue:"+isTrue);

	}

	public static boolean CheckVowel(String str){
			int cnt=0;
			for(int i=0; i<str.length();i++){
				char ch= str.charAt(i);
				if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
				return false;
				}
			}
				return true;
	}
}