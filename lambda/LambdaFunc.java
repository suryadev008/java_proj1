@FunctionalInterface
interface A {
	int add(int a,int b);
}

public class LambdaFunc{
	public static void main (String[] args){
		A obj= (int a,int b) -> a+b;		
		int result = obj.add(2,4);
		System.out.println("Result="+result);
	}
}