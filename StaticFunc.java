class Mobile{
    String Brand;
    int Price;
    static String Country="India"; // static variable
    public void displayDetails(){
        System.out.println("Brand:"+Brand);
        System.out.println("Price:"+Price);
        System.out.println("Country:"+Country);
    }

    public static void callMe(){
        System.out.println("Brand: My name");
    }
}

public class StaticFunc{
  public static void main(String args[]){
    Mobile obj1=new Mobile();
    obj1.Brand="Samsung";
    obj1.Price=150000;
    obj1.displayDetails();

    Mobile obj2=new Mobile();
    Mobile.Country="USA"; // accessing static variable without creating object
    obj2.Brand="Xiaomi";
    obj2.Price=50000;
    obj2.displayDetails();

    Mobile obj3=new Mobile();
    Mobile.Country="UK"; // accessing static variable without creating object
    obj3.Brand="Vivo";
    obj3.Price=45000;
    obj3.displayDetails();

    Mobile.callMe(); // accessing static method without creating object
  }
  
}