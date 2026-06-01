import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int dig = 0;
        while (n > 0) {
            dig++;
            n /= 10;
        }
        System.out.println("Number of digits in " + n + " is: " + dig);
        sc.close();
    }
}
