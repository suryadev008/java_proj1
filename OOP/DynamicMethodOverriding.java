class A{
	public void add(){
		System.out.println("Call A");
	}
}
class B extends A{
	public void add(){
		System.out.println("Call B");
	}
}
class C extends A{
	public void add(){
		System.out.println("Call C");
	}
}

public class DynamicMethodOverriding{
	public static void main(String[] args){
		A obj = new B();
		obj.add();

		A obj1= new A();
		obj1.add();

		obj1= new B();
		obj1.add();

		obj1= new C();
		obj1.add();
	}
}