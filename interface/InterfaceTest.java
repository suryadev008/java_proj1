interface Test{
	void show();
	void config();
}
class A implements Test{
	int age;
	public void show(){
		System.out.println("call show");
	}

	public void config(){
		System.out.println("call config");
	}

}

public class InterfaceTest{

	public static void main(String[] args){
		A obj=new A();
		obj.show();
		obj.config();
	}
}