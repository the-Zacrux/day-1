import java.util.Scanner;
public class program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter the power number : ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Result = " + result);
        sc.close();
    }
}