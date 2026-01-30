class Plaindrom{
	public static void main(String args[]){
		String str="AA";
		boolean isPalindorm=false;
		if(str!=null && str.length()>0){
			isPalindorm=isPalindorm(str);
		}
		System.out.print("isPalindorm:"+isPalindorm);
	}

	static boolean isPalindorm(String str){
		String strLow=str.toLowerCase();
		for(int i=0;i<=strLow.length()/2;i++){
			char start=strLow.charAt(i);
			char end=strLow.charAt(strLow.length()-i-1);
			if(start!=end){
				return false;
			}
		}
		return true;
	}
}