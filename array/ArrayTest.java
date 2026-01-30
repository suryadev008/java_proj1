public class ArrayTest{
	public static void main(String args[]){
		int arr1[]= new int [5];
		int[] arr2= {2,3,4};
		int[] arr3= new int[]{4,5,6};

		int[] arr4 = {1, 2, 3, 4, 5};
int[] arr5 = arr4.clone(); // Creates a new array with the same values


		// for(int ar1:arr1){
		// 	System.out.println("Arr:"+ar1);
		// }

		// System.out.println("Arr2:");
		// for(int ar2:arr2){
		// 	System.out.println("Arr:"+ar2);
		// }

		// System.out.println("Arr3:");
		// for(int ar3:arr3){
		// 	System.out.println("Arr:"+ar3);
		// }

		System.out.println("arr4:");
		for(int ar4:arr4){
			System.out.println("Arr4:"+ar4);
		}

		System.out.println("arr5:");
		for(int ar5:arr5){
			System.out.println("Arr5:"+ar5);
		}

		arr5[2]=333;

		System.out.println("After arr4:");
		for(int ar4:arr4){
			System.out.println("Arr4:"+ar4);
		}

		System.out.println("After arr5:");
		for(int ar5:arr5){
			System.out.println("Arr5:"+ar5);
		}

	}
}