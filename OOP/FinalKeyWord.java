final class AA{
	public void minus(){
		System.out.println("Call A");
	}
}

class A{
	public final void show(){
		System.out.println("Dev by Suraj");
	}
	public void add(){
		System.out.println("Call A");
	}
}
class B extends A{
	public void add(){
		System.out.println("Call B");
	}
	// @Override
	// public void show(){
	// 	System.out.println("Dev by AMs");
	// }
}
class C {
	public void add(){
		System.out.println("Call C");
	}
}

public class FinalKeyWord{
	public static void main(String[] args){
		final int a=7;
		// a=10;
		int b=5;
		A obj = new B();
		obj.add();

		A obj1= new A();
		obj1.add();

		obj1= new B();
		obj1.add();

		// obj1= new C();
		// obj1.add();
	}
}