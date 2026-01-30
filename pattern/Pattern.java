class Pattern{

	// pattern 1
	static void pattern1(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 2
	static void pattern2(){
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 3
	static void pattern3(){
		for(int i=5;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 4
	static void pattern4(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}


	// pattern 5
	static void pattern5(){
		for(int i=0;i<10;i++){
			int cols=i>5?10-i:i;
			for(int j=0;j<cols;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}


	// pattern 6
	static void pattern6(){
		int n=5;
		for(int i=1;i<=n;i++){
			int space=n-i;
			for(int k=0;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 7
	static void pattern7(){
		int n=5;
		for(int i=n;i>=0;i--){
			int space=n-i;
			for(int k=0;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}


	// pattern 8
	static void pattern8(){
		int n=10;
		int totalSpace=(n/2)-1;
		for(int i=0;i<n;i+=2){
			for(int k=0;k<totalSpace;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int k=0;k<totalSpace;k++){
				System.out.print(" ");
			}
			System.out.println();
			totalSpace--;
		}
	}

	// pattern 9
	static void pattern9(){
		int n=8;
		int totalSpace=(n/2)-1;
		for(int i=n;i>=0;i-=2){
			for(int k=0;k<totalSpace;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			// for(int k=0;k<totalSpace;k++){
			// 	System.out.print(" ");
			// }
			System.out.println();
			totalSpace++;
		}
	}


	// pattern 10
	static void pattern10(){
		int n=5;
		int totalSpace=(n*2)/2;
		for(int i=1;i<=n;i++){
			for(int k=0;k<totalSpace;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
				if(i>1){
					System.out.print(" ");
				}
			}
			// for(int k=0;k<totalSpace;k++){
			// 	System.out.print(" ");
			// }
			System.out.println();
			totalSpace--;
		}
	}

	// pattern 11
	static void pattern11(){
		int n=5;
		int totalSpace=0;
		for(int i=n;i>=0;i--){
			for(int k=0;k<totalSpace;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
				if(i>1){
					System.out.print(" ");
				}
			}
			// for(int k=0;k<totalSpace;k++){
			// 	System.out.print(" ");
			// }
			System.out.println();
			totalSpace++;
		}
	}

	// pattern 12
	static void pattern12(){
		int n = 5;

		 for (int i = n; i >= 1; i--) {
	        for (int s = 0; s < n - i; s++) {
	            System.out.print(" ");
	        }
	        for (int j = 0; j < i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }


	     for (int i = 2; i <= n; i++) {
	        for (int s = 0; s < n - i; s++) {
	            System.out.print(" ");
	        }
	        for (int j = 0; j < i; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }

    
		// int n2=5;
		// int totalSpace1=4;
		// for(int i=1;i<=n2;i++){
		// 	for(int k1=0;k1<totalSpace1;k1++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=0;j<i;j++){
		// 		System.out.print("*");
		// 		if(i>1){
		// 			System.out.print(" ");
		// 		}
		// 	}
		// 	// for(int k=0;k<totalSpace;k++){
		// 	// 	System.out.print(" ");
		// 	// }
		// 	System.out.println();
		// 	totalSpace1--;
		// }
	}


	public static void main(String[] args){
		// pattern1();
		// pattern2();
		// pattern3();
		// pattern4();
		// pattern5();
		// pattern6();
		// pattern7();
		// pattern8();
		// pattern9();
		// pattern10();
		// pattern11();
		pattern12();
	}
}


// *********