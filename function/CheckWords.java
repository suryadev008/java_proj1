import java.util.Scanner;
public class CheckWords{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		int cntWord =CountWords(str)+1;
		System.out.println("cntWord:"+cntWord);
	}

	public static int CountWords(String str){
			int cnt=0;
			for(int i=0; i<str.length();i++){
				if(str.charAt(i)==' '){
					cnt++;
				}
			}
		return cnt;
	}
}


data-product-skuid="{{product.sku}}"
                    data-product-id="{{product.id}}" data-variant-id="{{product.variant_id}}"