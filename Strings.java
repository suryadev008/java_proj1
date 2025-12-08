public class Strings{
    public static void main(String args[]){
        String str1= "Hello";
        String str2= "World";
        String str3= new String("Suraj");
        String str4= str1+ " " + str2 +" "+ str3;
        System.out.println(str4);
        str4= "Hello World";
         System.out.println(str4);

        //  Lower case
         System.out.println(str4.toUpperCase());
        // Upper case
        System.out.println(str4.toLowerCase());
        // Length of string
        System.out.println(str4.length());
        // case sensitive comparison
        String str11= "Hello World";
        String str22= "hello world";
        System.out.println("Case Sensetive:"+str11.equals(str22));
        // case insensitive comparison
        System.out.println("Case Insensitive:"+str11.equalsIgnoreCase(str22));
        
    }
}
