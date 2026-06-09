import java.util.Scanner;
public class program43{
    public static String prime(int a) {
        if (a < 2) {
            return "Not Prime";
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println( prime(x));
        sc.close();
    }
}