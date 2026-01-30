import java.util.Scanner;
public class LinerSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr={20,34, 44,212,55};
		int address=searchLiner(arr,55);
		System.out.println("Arr:"+arr.toString());
		if(address==-1){
			System.out.println("not found");
		}else{
			System.out.println("Prese in "+address);
		}
	}

	static int searchLiner(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
}


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for(int i=n;i>=n;i--){
            boolean isBad= isBadVersion(i); 
            if(isBad==false){
                return i+1;
            }
        }
        return 0;        
    }
}