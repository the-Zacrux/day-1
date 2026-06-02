import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int pro = 1;
        while (n > 0) {
            pro *= n % 10;
            n /= 10;
        }
        System.out.println("Product of digits in " + n + " is: " + pro);
        sc.close();
    }
}
