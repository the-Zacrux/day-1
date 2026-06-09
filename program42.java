import java.util.Scanner;
public class program42{
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Maximum = " + max(x, y));
        sc.close();
    }
}