enum Status{
	Running, Failed, Penoding, Success
}
public class EnumTest{

	public static void main(String[] args){
		Status[] ss= Status.values();
		for(Status s:ss){
			System.out.println("S:"+s);
		}
	}
}


