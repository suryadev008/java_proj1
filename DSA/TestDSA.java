import java.util.Scanner;
public class TestDSA{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] nums={4,5,6,7,0,1,2};
		int target=2;
		int start= 0;
        int end = nums.length-1;
        int rotation=1;
        if(nums[start]>nums[end]){
            int i=end;
           while(i<=end){
            if(nums[i]<nums[i-1]){
               break; 
            }
            rotation++;
            i--;
           }
        }
        int leftHalfEnd=(end-rotation)-1;
        int rightHalfStart=end-rotation;
        int leftHalf=searchBinary(nums,target,start,leftHalfEnd);
       	if(leftHalf==-1){
       		int rightHalf=searchBinary(nums,target,rightHalfStart,end);
       		if(rightHalf!=-1){
       			 System.out.println("rightHalf="+rightHalf);
       		}
       		System.out.println("rightHalf="+ -1);
       		// return -1;
       	}else{
       		// return -1;
       		System.out.println("leftHalf="+ -1);
       	}


		// int target=0;
		// int startPoint=searchBinary(nums,target);
		// // int result=searchBinary(nums,target);
		System.out.println("rotation="+rotation);
	}

	static int searchBinary(int[] nums, int target,int startpoint,int endPoint){
		if(nums.length==0){
			return -1;
		}
		int start=startpoint;
		int end=endPoint;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(nums[mid]==target){
				return mid;
			}
			else if(target>nums[mid]){
					start=mid+1;
			}else{
					end=mid-1;
			}
		}
		return -1;
	}
}
