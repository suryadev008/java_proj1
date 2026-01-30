import java.util.Scanner;
public class FloorProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr={2,3,5,6,8,12,16,17,19,22,25,27,31};
		int target=18;
		int result=searchBinary(arr,target);
		System.out.println("result="+result);
	}

	static int searchBinary(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==target){
				return arr[mid];
			}
			else if(target>arr[mid]){
					low=mid+1;
			}else{
					high=mid-1;
			}
		}
		if(low<arr.length){
				return arr[high];
			}
		return -1;
	}
}
