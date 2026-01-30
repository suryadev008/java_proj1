import java.util.Scanner;
public class CeillingProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr={2,3,5,6,8,12,16,17,19,22,25,27,31};
		int target=23;
		int result=searchBinary(arr,target);
		System.out.println("result="+result);
	}

	static int searchBinary(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==target){
				return arr[mid];
			}
			else if(target>arr[mid]){
					start=mid+1;
			}else{
					end=mid-1;
			}
		}
		if(start<arr.length){
				return arr[start];
			}
		return -1;
	}
}
