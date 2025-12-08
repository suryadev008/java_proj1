import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        long num = sc.nextLong();  // use long instead of double

        System.out.println("Enter check Number:");
        int checkNum = sc.nextInt();

        int cnt = 0;

        while (num > 0) {
            long rem = num % 10;
            System.out.println("Remainder: " + rem);

            if (rem == checkNum) {
                cnt++;
            }

            num /= 10;
        }

        System.out.println("The count of " + checkNum + " is: " + cnt);
    }
}
