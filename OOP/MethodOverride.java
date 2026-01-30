class A{
	public int add(int a,int b){
		return a+b;
	}
}
class B extends A{
	public int add(int a,int b){
		int parentResult = super.add(a, b);
		// return a+b+1;
		return parentResult+1;
	}
}

public class MethodOverride{
	public static void main(String[] args){
		B obj = new B();
		int a = obj.add(4,7);

		System.out.println(a);
	}
}