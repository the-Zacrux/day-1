import java.util.Scanner;
public class program48 {
    public static boolean perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (perfect(n))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
        sc.close();
    }
}