class A{
	public A(){
		System.out.println("In A");
	}
	public A(int a,int b){
		System.out.println("In A"+a+" "+b);
	}
}
class B extends A{
	public B(){

		System.out.println("In B");
	}
	public B(int a,int b){
		super(a,b);
		this();
		System.out.println("In B "+a+" "+b);
	}
}

public class SuperNThis{
	public static void main(String[] args){
		B obj = new B(4,7);
	}
}