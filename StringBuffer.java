public class Strings{
    public static void main(String args[]){
        String str1= "Hello";
        String str2= "World";
        String str3= new String("Suraj");
        String str4= str1+ " " + str2 +" "+ str3;
        System.out.println(str4);
        str4= "Hello World";
         System.out.println(str4);
        StringBuffer sb= new StringBuffer();
        sb.append("Hello World");
        sb.append(" Suraj");
        System.out.println(sb.toString());
    }
}
