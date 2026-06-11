import java.util.Scanner;
public class program46 {
    public static boolean armstrong(int n) {
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (armstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        sc.close();
    }
}